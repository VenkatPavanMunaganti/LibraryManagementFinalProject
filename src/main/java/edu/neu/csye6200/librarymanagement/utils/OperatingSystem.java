/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.utils;

import edu.neu.csye6200.librarymanagement.models.Book;
import edu.neu.csye6200.librarymanagement.models.IssuedBook;
import edu.neu.csye6200.librarymanagement.models.User;
import edu.neu.csye6200.librarymanagement.models.User.UserRole;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Raja Shekar
 */
public class OperatingSystem {
    
    
    private List<User> users;
    private List<Book> books;
    private List<IssuedBook> issuedBooks;
    
    private static final OperatingSystem os = new OperatingSystem();
    
    private OperatingSystem(){
        loadUsers();
        loadIssuedBooks();
        loadBooks();
        System.out.println(users);
        System.out.println(books);
    }

    @Override
    public String toString() {
        return "OperatingSystem{" + "users=" + users + ", books=" + books + ", issuedBooks=" + issuedBooks + '}';
    }
    
    public static OperatingSystem getInstance(){
        return os;
    }
    
    public void loadUsers(){
        
        users = new ArrayList<User>();
        try {
            
            List<String> usersFileContent = Files.readAllLines(Path.of("csv/users.csv"));
            UserSingletonFactory userFactory = UserSingletonFactory.getInstance();
            usersFileContent.forEach(line -> {
                if(line.trim().length()>0)
                    users.add(userFactory.createUser(line.trim()));
            });
//            users.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("File not found");
        }
                
    }
    public void loadIssuedBooks(){
        issuedBooks = new ArrayList<IssuedBook>();
        try {
            
            List<String> issuedBooksFileContent = Files.readAllLines(Path.of("csv/issuedBooks.csv"));
            IssuedBookSingletonFactory issuedBooksFactory = IssuedBookSingletonFactory.getInstance();
            issuedBooksFileContent.forEach(line -> {
                if(line.trim().length()>0)
                    issuedBooks.add(issuedBooksFactory.createIssuedBook(line.trim()));
            });
//            issuedBooks.forEach(ib -> {
//                System.out.println(ib.getRemainingDays());
//                System.out.println(ib.getLateFee());
//            });
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
    public void loadBooks(){
        books = new ArrayList<Book>();
        try {
            
            List<String> booksFileContent = Files.readAllLines(Path.of("csv/books.csv"));
            BookSingletonFactory bookSingletonFactory = BookSingletonFactory.getInstance();
            booksFileContent.forEach(line -> {
                if(line.trim().length()>0)
                    books.add(bookSingletonFactory.createBook(line.trim()));
            });
//            books.forEach(book -> {
//                System.out.println(book);
//            });
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
    public void writeUsers(){
        try{
            List<User> copyUsers = new ArrayList<>(users);
            copyUsers.forEach(user -> {
                if (user.getFirstName().isBlank() || user.getEmail().isBlank() || user.getId().isBlank()) {
                    users.remove(user);
                    System.out.println("removed user: " + user.toString());
                }
            });
            Files.write(Path.of("csv/users.csv"), users.stream().map(user -> user.toString()).toList(), StandardOpenOption.TRUNCATE_EXISTING);

        } catch (Exception e) {
            System.out.println("File not found");
        }
        loadUsers();
    }
    
    public void writeIssuedBooks(){
        try{
            Files.write(Path.of("csv/issuedBooks.csv"), issuedBooks.stream().map(issuedBook -> issuedBook.toString()).toList(), StandardOpenOption.TRUNCATE_EXISTING);

        } catch (Exception e) {
            System.out.println("File not found");
        }
        loadIssuedBooks();
    }
    
    public void writeBooks(){
        try{
            Files.write(Path.of("csv/books.csv"), books.stream().map(book -> book.toString()).toList(), StandardOpenOption.TRUNCATE_EXISTING);

        } catch (Exception e) {
            System.out.println("File not found");
        }
        loadBooks();
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<IssuedBook> getIssuedBooks() {
        return issuedBooks;
    }
    
}
