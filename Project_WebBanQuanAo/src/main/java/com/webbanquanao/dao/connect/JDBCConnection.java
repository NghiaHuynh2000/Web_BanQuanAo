package com.webbanquanao.dao.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "nhattaisin9999";
            String url = "jdbc:mysql://localhost:3306/web_ban_quan_ao";
            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("thanh cong");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

