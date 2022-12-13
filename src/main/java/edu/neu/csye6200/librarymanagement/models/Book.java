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
public class Book {
    
    private String id;
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private int bookEdition;
    private int bookQuantity;
    private int remainingBooks;

    public Book(String id, String bookName, String bookAuthor, String bookPublisher, int bookEdition, int bookQuantity, int remainingBooks) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookEdition = bookEdition;
        this.bookQuantity = bookQuantity;
        this.remainingBooks = remainingBooks;
    }
    
    public Book(String csv){
        Scanner sc = new Scanner(csv);
        sc.useDelimiter(",");
        try{
            this.id = sc.next();
            this.bookName = sc.next();
            this.bookAuthor = sc.next();
            this.bookPublisher = sc.next();
            this.bookEdition = Integer.parseInt(sc.next());
            this.bookQuantity = Integer.parseInt(sc.next());
            this.remainingBooks = Integer.parseInt(sc.next());
            
        }
        catch(Exception e){
            System.out.println("in book scanner");
            System.out.println("Encountered some error");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(int bookEdition) {
        this.bookEdition = bookEdition;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public int getRemainingBooks() {
        return remainingBooks;
    }

    public void setRemainingBooks(int remainingBooks) {
        this.remainingBooks = remainingBooks;
    }

    @Override
    public String toString() {
        return id + "," + bookName + "," + bookAuthor + "," + bookPublisher + "," + bookEdition + "," + bookQuantity + "," + remainingBooks;
    }
    
}
