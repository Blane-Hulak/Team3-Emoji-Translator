/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/17/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.
 */
package emoji.translator;

public class Translate {

    EmojiManager emoji;
    String userInput;

    // Default Constructor
    public Translate(EmojiManager emoji) {
        this.emoji = emoji;

    }

    // Constructor
    public Translate(String userInput, EmojiManager emoji) {
        this.userInput = userInput;
        this.emoji = emoji;

    }

    // Method to perform translation
    public String translator(String userInput, EmojiManager emoji) {
        //Taking out spaces from the String to store the other elements
        String[] words = userInput.split(" ");
        //Allows string to be changeable
        StringBuilder translatedText = new StringBuilder();

        //Loop sorting through every word in words array
        for (String word : words) {
            //accounting for puncuation and lowercase letters
            String change = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            //If a keyword is found, change the keyword to an emoji
            if (emoji.containsKeyword(change)) {
                translatedText.append(emoji.getEmoji(change)).append(word.replaceAll("[a-zA-Z0-9]", ""));
            } else {
                translatedText.append(word);
            }
            translatedText.append(" ");

        }

        return translatedText.toString().trim();

    }

}
