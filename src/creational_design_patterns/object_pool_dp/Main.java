package creational_design_patterns.object_pool_dp;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The object pool pattern is a software creation-al design pattern that uses a set of initialized objects
 * kept ready to use – a "pool" – rather than allocating and destroying them on demand.
 * A client of the pool will request an object from the pool and perform operations on the returned object.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, SQLException {
        String url = "jdbc:mysql://localhost:3306/db_school";
        String user = "root";
        String password = "+S>#Lx5989KR;e/^";

        ConnectionsPool connectionsPool = new ConnectionsPool(url, user, password);

        Connection c1 = connectionsPool.acquireObjectFromPool();
        printHashCode(c1);

//        connectionsPool.releaseObjectToPool(c1);
//        Thread.sleep(4000);

        Connection c2 = connectionsPool.acquireObjectFromPool();
        printHashCode(c2);

        Connection c3 = connectionsPool.acquireObjectFromPool();
        printHashCode(c3);

        Thread.sleep(5000);
        connectionsPool.releaseObjectToPool(c1);

        Connection c4 = connectionsPool.acquireObjectFromPool();
        printHashCode(c4);
    }

    static void printHashCode(Connection c) {
        try {
            System.out.println("\t you can use connection hashCode: " + c.hashCode());
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }
}
