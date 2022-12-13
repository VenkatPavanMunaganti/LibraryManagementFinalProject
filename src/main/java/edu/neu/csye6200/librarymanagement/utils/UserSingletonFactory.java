/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.utils;

import edu.neu.csye6200.librarymanagement.models.Admin;
import edu.neu.csye6200.librarymanagement.models.Staff;
import edu.neu.csye6200.librarymanagement.models.Student;
import edu.neu.csye6200.librarymanagement.models.Teacher;
import edu.neu.csye6200.librarymanagement.models.User;
import edu.neu.csye6200.librarymanagement.models.User.UserRole;

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
        String[] csvsplit = csv.split(",");
        UserRole role = UserRole.valueOf(csvsplit[csvsplit.length-1]);
        User user = null;
        switch(role){
            
            case ADMIN:     user = new Admin(csv);
                            break;
            
            case STUDENT:   user = new Student(csv);
                            break;
                            
            case STAFF:     user = new Staff(csv);
                            break;
             
            case TEACHER:   user = new Teacher(csv);
                            break;
                            
            default:        user = new User(csv); 
        }
        
        return user;
    }
}
