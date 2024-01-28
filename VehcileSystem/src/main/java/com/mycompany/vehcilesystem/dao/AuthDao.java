/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehcilesystem.dao;

import com.mycompany.vehcilesystem.database.MySqlConnection;
import com.mycompany.vehcilesystem.model.Register_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class AuthDao extends MySqlConnection {
    public boolean resgister(Register_Model registerModel){
        try{
           PreparedStatement ps = null;
           Connection conn = openConnection();
           
           String sql = "INSERT INTO user(username, password) VALUES(?,?)";
           ps = conn.prepareStatement(sql);
           ps.setString(1, registerModel.getUsername());
           ps.setString(2,registerModel.getPassword());
           
           int result = ps.executeUpdate();
           if(result == -1){
               return false;
           }else{
               return true;
           }
//           Use executeUpdate for query that has Create Update or delete.
        }catch(Exception e){
            return false;
        }
//        return false;
    }
}
