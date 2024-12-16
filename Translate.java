/*
 * Project: Emoji Translator
 * Author: Sam Schaefer
 * Date: 12/16/2024
 * Description: This class wants to processe text, match substring with emoji table and replace them with emoji's.
 */

public class Translate extends EmojiManager {

    EmojiManager emoji;
    InputHandler input;

    // Default Constructor
    public Translate() {
        this.emoji = new EmojiManager();
        this.input = new InputHandler();

    }

    // Constructor
    public Translate(EmojiManager emoji, InputHandler input) {
        this.emoji = emoji;
        this.input = input;
    }

    // Method to perform translation
    public String translator(String text) {
        String[] words = text.split(" ");
        StringBuilder translatedText = new StringBuilder();
        for (String word : words) {
            boolean found = false;
            String change = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (emoji.containsKeyword(change)) {
                translatedText.append(emoji.getEmoji(change)).append(word.replaceAll("[a-zA-Z0-9]", ""));

                found = true;
            }
            if (!found) {

                translatedText.append(word).append(" ");

            }
        }

        return translatedText.toString().trim();

    }
}
