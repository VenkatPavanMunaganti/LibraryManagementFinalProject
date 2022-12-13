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
public class UsernameVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String inputText = ((JTextField)input).getText();
        
        String usernamePattern = "^[a-zA-Z0-9_]+$";
        
        if(!Pattern.compile(usernamePattern).matcher(inputText).matches()){
            JOptionPane.showMessageDialog(input, "Username should contain only letters, numbers and underscore");
            return false;
        }
        
        return true;
    }
    
}
