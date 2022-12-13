/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.utils;

import edu.neu.csye6200.librarymanagement.models.Book;

/**
 *
 * @author Raja Shekar
 */
public class BookSingletonFactory {
    
    private static final BookSingletonFactory instance = new BookSingletonFactory();
    
    private BookSingletonFactory(){
        
    }
    
    public static BookSingletonFactory getInstance(){
        return instance;
    }
    
    public Book createBook(String csv){
        return new Book(csv);
    }
}
