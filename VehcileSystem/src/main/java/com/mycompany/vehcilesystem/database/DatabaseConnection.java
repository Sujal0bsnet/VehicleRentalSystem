/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehcilesystem.database;

//import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author user
 */
public interface DatabaseConnection {
    Connection openConnection();
    void closeConnection(Connection conn);
    ResultSet runQuerry(Connection conn, String query);
    int executeUpdate(Connection conn,String query);
}
