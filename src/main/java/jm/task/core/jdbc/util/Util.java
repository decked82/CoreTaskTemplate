package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String username = "root";
    private String password = "Crud&80_";

    Connection connection = null;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to mydb successful");
        } catch (SQLException throwables) {
            System.out.println("Connection failed");
            throwables.printStackTrace();
        }
        return connection;
    }
}
