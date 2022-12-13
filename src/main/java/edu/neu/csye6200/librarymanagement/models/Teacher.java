/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.models;

/**
 *
 * @author Raja Shekar
 */
public class Teacher extends User {

    public Teacher(String id, String firstName, String lastName, String email, String phoneNumber, String username, String password, UserRole role) {
        super(id, firstName, lastName, email, phoneNumber, username, password, role);
    }
    
    public Teacher(String csv){
        super(csv);
    }
    
}
