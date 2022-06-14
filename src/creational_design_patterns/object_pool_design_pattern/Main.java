package creational_design_patterns.object_pool_design_pattern;

import java.sql.Connection;
import java.sql.SQLException;

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
