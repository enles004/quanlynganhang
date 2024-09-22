/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author nobpe
 */
public class db {
    public static Connection connect() throws ClassNotFoundException{
        Connection con = null;
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = config.db_url;
        String user = config.db_username;
        String pass = config.db_pass;
        con = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    
    public static void close(Connection con){
        if (con != null){
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
