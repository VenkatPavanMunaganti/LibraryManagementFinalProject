/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.models;

/**
 *
 * @author Raja Shekar
 */
public class Admin extends User {

    public Admin(String id, String firstName, String lastName, String email, String phoneNumber, String username, String password, UserRole role) {
        super(id, firstName, lastName, email, phoneNumber, username, password, role);
    }
    
    public Admin(String csv){
        super(csv);
    }

}
