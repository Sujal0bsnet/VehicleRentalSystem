/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehcilesystem.model;

/**
 *
 * @author user
 */
public class Login_model {
    private String email;
    private String password;
    
    public Login_model(String a, String b){
        this.email = a;
        this.password=b;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
}
