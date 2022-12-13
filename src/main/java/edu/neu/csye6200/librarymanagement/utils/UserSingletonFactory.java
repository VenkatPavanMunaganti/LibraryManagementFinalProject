/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.utils;

import edu.neu.csye6200.librarymanagement.models.User;

/**
 *
 * @author Raja Shekar
 */
public class UserSingletonFactory {
    
    
    private static final UserSingletonFactory instance = new UserSingletonFactory();
    
    private UserSingletonFactory(){
        
    }
    
    public static UserSingletonFactory getInstance(){
        return instance;
    }
    
    public User createUser(String csv){
        return new User(csv);
    }
}
