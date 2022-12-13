/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Raja Shekar
 */
public class IssuedBook {
    
    
    private String issuedBookID;
    private String issuedPersonID;
    private LocalDate issuedDate;
    private int totalDaysIssued;
    private int remainingDays;
    private double lateFee;

    public IssuedBook(String issuedBookID, String issuedPersonID, LocalDate issuedDate, int totalDaysIssued) {
        this.issuedBookID = issuedBookID;
        this.issuedPersonID = issuedPersonID;
        this.issuedDate = issuedDate;
        this.totalDaysIssued=totalDaysIssued;
        LocalDate today = LocalDate.now();
        Period p = Period.between(issuedDate, today);
        int r = totalDaysIssued - p.getDays();
        this.remainingDays = r > 0 ? r : 0;
        this.lateFee = r > 0 ? 0.0 : Math.abs(r)*0.25;
    }
    
    public IssuedBook(String csv){
        Scanner sc = new Scanner(csv);
        sc.useDelimiter(",");
        try{
            String ibID = sc.next();
            String ipID = sc.next();
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("uuuu-MM-d");
            String dt= sc.next();
            LocalDate iDate = LocalDate.parse(dt, formatters);
            int tdIssued = Integer.parseInt(sc.next());
            this.issuedBookID = ibID;
            this.issuedPersonID = ipID;
            this.issuedDate = iDate;
            this.totalDaysIssued = tdIssued;
            LocalDate today = LocalDate.now();
            Period p = Period.between(issuedDate, today);
            int r = totalDaysIssued - p.getDays();
            this.remainingDays = r > 0 ? r : 0;
            this.lateFee = r > 0 ? 0.0 : Math.abs(r)*0.25;
        }
        catch(Exception e){
            System.out.println("in issued book scanner");
            System.out.println("Encountered some error");
            e.printStackTrace();
        }
    }

    public String getIssuedBookID() {
        return issuedBookID;
    }

    public void setIssuedBookID(String issuedBookID) {
        this.issuedBookID = issuedBookID;
    }

    public String getIssuedPersonID() {
        return issuedPersonID;
    }

    public void setIssuedPersonID(String issuedPersonID) {
        this.issuedPersonID = issuedPersonID;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getTotalDaysIssued() {
        return totalDaysIssued;
    }

    public void setTotalDaysIssued(int totalDaysIssued) {
        this.totalDaysIssued = totalDaysIssued;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(int remainingDays) {
        this.remainingDays = remainingDays;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public String toString() {
        return issuedBookID + "," + issuedPersonID +"," + issuedDate.toString() + "," + totalDaysIssued;
    }
    
}
