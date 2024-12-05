/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/04/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.

package emoji.translator;

import java.util.Scanner;


// Making translate the child of InputHandler to be able to use getUserInput??
public class Translate extends InputHandler {
    
Emoji Manager emoji;

    // Default Constructor 
    public Translate(){

    }
    // Constructor
    public Translate(String combo, EmojiHandler emoji, InputHandler inputHandler) {
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
    public String translated(String text) {
        // This method will use emojiHandler and inputHandler to translate text to emoji language
        return "The text" + text + "in emoji is:" + combo;
    }
}
