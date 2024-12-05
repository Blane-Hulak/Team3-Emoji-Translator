/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/04/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.

package emoji.translator;

import java.util.Scanner;


public class Translate {
    
    EmojiHandler emoji;
    Inputhandler input;
    

    // Default Constructor 
    public Translate(){
    this.emoji = new EmojiHandler();
    this.input = new InputHandler();
        
    }
    
    // Constructor
    public Translate(String combo, EmojiHandler emoji, InputHandler input) {
        this.combo = combo;
        this.emoji = emoji;
        this.inputHandler = inputHandler;
    }
    
    // Getter for emojiHandler
    public EmojiHandler getEmojiHandler() {
        return emoji;
    }
    
    // Setter for emojiHandler
    public void setEmojiHandler(EmojiHandler emoji) {
        this.emoji = emoji;
    }
    
    // Getter for inputHandler
    public InputHandler getInputHandler() {
        return inputHandler;
    }
    
    // Setter for inputHandler
    public void setInputHandler(InputHandler input) {
        this.inputHandler = input;
    }

    // Method to search for matching substring
    public String compare(String text){
        return text
    }

    // Method to perform translation
    public String translated(String text) {
        // This method will use emojiHandler and inputHandler to translate text to emoji language
        return "The text" + text + "in emoji is:" + combo;
    }
}
