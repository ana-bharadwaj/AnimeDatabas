/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CheckConnection {

    public static void main(String args[])
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/anime";
        String username = "root";
        String password = "";
       
        Connection connection = null;
       
        try
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection successful ...");
            connection.close();
        }
        catch(ClassNotFoundException | SQLException cnfe)
        {
            System.out.println(cnfe);
        }
    }
}


   

    

