package pupunisan.login_register;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Database {
    public static ArrayList<String[]> usersList = new ArrayList<>();
    
    public static void addUser(String email, String username, String password, String confirmPassword){
        usersList.add(new String[]{email,username, password, confirmPassword});
    }
    
    public static boolean isValidlogin(String email, String password){
        for(String[] user: usersList){
            if(user[0].equals(email)&& user[2].equals(password)){
                return true;
            }
            
        }
        return false;
            
            
            
            
            
            
            
            
    }

    
}
