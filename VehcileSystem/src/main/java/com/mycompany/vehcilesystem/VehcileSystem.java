/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehcilesystem;

import com.mycompany.vehcilesystem.dao.AuthDao;
import com.mycompany.vehcilesystem.model.Register_Model;
import com.mycompany.vehcilesystem.view.Login_Page;

/**
 *
 * @author user
 */
public class VehcileSystem {
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Login_Page log = new Login_Page();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        
        RegistrationScreen rs = new RegistrationScreen();
        rs.setVisible(true);
        
        AuthDao auth = new AuthDao();
        String username = "username";
        String password = "password";
        Register_Model rm = new Register_Model(
            password,username
        );
        boolean result = auth.resgister(rm);
        if(result == true){
            System.out.println("Created user");
        }else{
            System.out.println("Error");
        }
    }
 
}
