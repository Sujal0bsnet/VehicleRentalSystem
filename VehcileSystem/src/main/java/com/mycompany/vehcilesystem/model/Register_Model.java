/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehcilesystem.model;

/**
 *
 * @author user
 */
public class Register_Model {
    private String password;
    private String username;
   
    public Register_Model (String username, String password){
        this.password=password;
        this.username= username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUsername(){
        return this.username;
    }
}
