/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.utils;

import edu.neu.csye6200.librarymanagement.models.IssuedBook;

/**
 *
 * @author Raja Shekar
 */
public class IssuedBookSingletonFactory {
    
    private static final IssuedBookSingletonFactory instance = new IssuedBookSingletonFactory();
    
    private IssuedBookSingletonFactory(){
        
    }
    
    public static IssuedBookSingletonFactory getInstance(){
        return instance;
    }
    
    public IssuedBook createIssuedBook(String csv){
        return new IssuedBook(csv);
    }
}
