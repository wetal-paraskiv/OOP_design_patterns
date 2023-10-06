package creational_design_patterns.object_pool_dp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsPool extends AbstractPool<Connection>{
    private String url;
    private String user;
    private String password;

    public ConnectionsPool(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    Connection create() {
        System.out.println("Creating a connection object...");
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    boolean validate(Connection connection) {
        try {
            return !(connection.isClosed());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }
    }

    @Override
    void close(Connection connection) {
        System.out.println("Connection expired... Closing the connection...");
        try {
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}
