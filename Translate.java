/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/04/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.
 */

package emoji.translator;

import java.util.HashMap;
import java.util.Scanner;

public class Translate {

    private static InputHandler InputHandler = null;
    EmojiManager emoji;
    InputHandler input;

    // Default Constructor
    public Translate() {
        this.emoji = new EmojiManager();
        this.input = new InputHandler();

    }

    // Constructor
    public Translate(EmojiManager emoji, InputHandler input, InputHandler InputHandler) {
        this.emoji = emoji;
        Translate.InputHandler = InputHandler;
    }

    // Getter for emojiHandler
    public EmojiManager getEmojiManager() {
        return emoji;
    }

    // Setter for emojiHandler
    public void setEmojiHandler(EmojiManager emoji) {
        this.emoji = emoji;
    }

    // Getter for inputHandler
    public InputHandler getInputHandler() {
        return InputHandler;
    }

    // Setter for inputHandler
    public void setInputHandler(InputHandler input) {
        Translate.InputHandler = input;
    }

    // Method to search for matching substring
    public String compare(String text) {
        return text;
    }

    // Method to perform translation
    public String translated(String text, EmojiManager emoji) {
        // This method will use emojiHandler and inputHandler to translate text to emoji
        // language
        return "The text" + text + "in emoji is:" + emoji;
    }
}
