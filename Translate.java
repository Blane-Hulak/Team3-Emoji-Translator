/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/17/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.
 */

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
        String[] words = userInput.split(" ");
        StringBuilder translatedText = new StringBuilder();

        for (String word : words) {
            String change = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

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
