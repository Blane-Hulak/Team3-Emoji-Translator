/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/04/2024
 * Description: This class is used to take the characters and translate them into characters.

package emoji.translator;

import java.util.Scanner;




// Making translate the child of InputHandler to be able to use getUserInput??
public class Translate extends InputHandler {
    
Emoji Manager emoji;

    // Default Constructor 
    public Translate(){

    }
    // Constructor
    public Translator(String combo, EmojiHandler emoji, InputHandler inputHandler) {
        this.combo = combo;
        this.emoji = emoji;
        this.inputHandler = inputHandler;
    }
    
    // Getter for emojiHandler
    public EmojiHandler getEmojiHandler() {
        return emojiHandler;
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
    public void setInputHandler(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    // Method to perform translation
    public String translate(String text) {
        // Placeholder for translation logic
        // This method will use emojiHandler and inputHandler to translate text to emoji language
        return "Translated text in " + language;
    }

    // Method to perform reverse translation (emoji to text)
    public String reverseTranslate(String emojiText) {
        // Placeholder for reverse translation logic
        return "Reversed translation of emoji text";
    }

    // Additional methods can be added as necessary for the Translator's functionality
}
