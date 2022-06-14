package creational_design_patterns.singleton_design_pattern;

/**
 * The easier way to create a thread-safe creational_design_patterns.singleton class is to make the global access method synchronized,
 * so that only one thread can execute this method at a time
 */
public class SingleTonThreadSafeButLocking {

    private static SingleTonThreadSafeButLocking INSTANCE;

    private SingleTonThreadSafeButLocking() {
    }

    /**
     * that method works fine and provides thread-safety, but it reduces the performance because of the cost of
     * synchronized method, although we need it only for the first few threads who might create the separate instances
     */
    public static synchronized SingleTonThreadSafeButLocking getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonThreadSafeButLocking();
        }
        return INSTANCE;
    }

    /**
     * To avoid this extra overhead every time, double-checked locking principle is used.
     * In this approach, the synchronized block is used inside the if condition with an additional check
     * to ensure that only one instance of a creational_design_patterns.singleton class is created.
     */
    public static SingleTonThreadSafeButLocking getInstanceUsingDoubleLocking() {
        if (INSTANCE == null) {
            synchronized (SingleTonThreadSafeButLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTonThreadSafeButLocking();
                }
            }
        }
        return INSTANCE;
    }
}
