/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package emoji.translator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package emoji.translator;
import java.util.Scanner;

/*
 * Project: Emoji Translator
 * Date: 12/04/2024
 * Description: This class contains the methods for getting and outputting the users inputted String
 * values.
 */

public class InputHandler {
    
    // This is the primary method that'll get user input to use in the translator class.
    // It is a public String, and can be instantiated by other classes. It also contains a small
    // outputInput method that print's out the user's input. This could be expanded on later to be
    // more involved with the Translator class once we've fleshed our project out a bit more.
    
    // Below is the getUserInput method. It utilizes a scanner to the user's inputted string to be 
    // used by other methods in the project. 
    
    public String getUserInput() {       
        Scanner scan = new Scanner(System.in);
        
        String userInput;
        System.out.println("Enter a string of text for our emoji translator to translate!: ");
        userInput = scan.nextLine();
        
        scan.close();
        return userInput;
        
    }
    
    // Below is the outputInput method. Right now, it just outputs the user's inputted string.
    // could become more advanced and change in the near future.
    
     public void outputInput (String userInput) {   
         System.out.println("You inputted: " + userInput);
         
         // More code to be added here in the future
         
     }   
    
    
}
