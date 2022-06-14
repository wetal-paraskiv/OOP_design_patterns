package creational_design_patterns.object_pool_design_pattern;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class AbstractPool<T> {
    private int poolLimit;
    long expireTime;
    Hashtable<T, Long> usedObjects;
    Hashtable<T, Long> freeObjects;

    AbstractPool() {
        poolLimit = 2;
        expireTime = 3000;
        usedObjects = new Hashtable<>();
        freeObjects = new Hashtable<>();
    }

    abstract T create();

    abstract boolean validate(T t);

    abstract void close(T t);

    synchronized T acquireObjectFromPool() {
        long now = System.currentTimeMillis();
        T t;
        // if any free object at all
        if (freeObjects.size() > 0) {
            Enumeration<T> e = freeObjects.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();

                // if object time is expired: remove & close
                if (now - freeObjects.get(t) > expireTime) {
                    freeObjects.remove(t);
                    close(t);
                } else {
                    // check if it was released manually => it is free, use this object
                    if (validate(t)) {
                        freeObjects.remove(t);
                        usedObjects.put(t, now);
                        return t;
                    }
                }
            }
        } else {
            // if no free object and there wasn't reached poolLimit, create new one
            if (usedObjects.size() < poolLimit) {
                t = create();
                usedObjects.put(t, now);
                return t;
            } else {
                System.out.println("Creating a connection object...");
                System.out.println(
                        "\tPool upper limit achieved!\nWait for queue object to release... it won't be too long :)");
            }
        }
        return null;
    }

    synchronized void releaseObjectToPool(T t) {
        usedObjects.remove(t);
        freeObjects.put(t, System.currentTimeMillis());
    }

}
