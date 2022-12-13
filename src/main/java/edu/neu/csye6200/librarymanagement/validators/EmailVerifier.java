/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.librarymanagement.validators;

import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Raja Shekar
 */
public class EmailVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        
        String emailText = ((JTextField) input).getText().trim();
        
        String emailRegex = "^[a-zA-Z]{3,}.[a-zA-Z]+@northeastern.edu$";
        
        if(!Pattern.compile(emailRegex).matcher(emailText).matches()){
            JOptionPane.showMessageDialog(input, "Please enter a valid northeastern mail id");
            return false;
        }
        
        return true;
        
    }
    
}
