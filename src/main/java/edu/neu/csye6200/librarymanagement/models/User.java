/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.models;

import java.util.Scanner;

/**
 *
 * @author Raja Shekar
 */
public class User {
    
    public enum UserRole{
        ADMIN,
        STUDENT,
        STAFF,
        TEACHER
    }
    
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private UserRole role;

    public User(String id, String firstName, String lastName, String email, String phoneNumber, String username, String password, UserRole role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(String csv){
        Scanner sc = new Scanner(csv);
        sc.useDelimiter(",");
        try{
            this.id = sc.next();
            this.firstName = sc.next();
            this.lastName = sc.next();
            this.email = sc.next();
            this.phoneNumber = sc.next();
            this.username = sc.next();
            this.password = sc.next();
            this.role = UserRole.valueOf(sc.next());
        }
        catch(Exception e){
            System.out.println("in user scanner");
            System.out.println("Encountered some error");
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return  id + "," + firstName + ","  + lastName + ","  + email + "," + phoneNumber + "," + username + ","  + password + "," + role.toString();
    }
      
}
