
package emoji.translator;

import java.util.HashMap;

/*
 * Project: Emoji Translator
 * Author: Ellie Earwood
 * Date: 12/16/2024
 * Description: The EmojiManager class provides a centralized repository for managing keyword-to-emoji mappings.
 * It allows adding, retrieving, and checking for emojis based on specific keywords.
 * This class is designed to be used by other components like the Translator for emoji replacements.
 */

public class EmojiManager {

    // A HashMap to store keyword-to-emoji mappings
    private HashMap<String, String> emojiTable;

    /**
     * Default constructor to initialize the emoji table.
     */
    public EmojiManager() {
        emojiTable = new HashMap<>();
        initializeDefaultEmojis(); // Load some default emojis for testing
    }

    /**
     * Adds a new emoji mapping to the table.
     * 
     * @param keyword The keyword to be replaced with an emoji.
     * @param emoji   The emoji to map to the keyword.
     */
    public void addEmoji(String keyword, String emoji) {
        if (keyword == null || emoji == null) {
            throw new IllegalArgumentException("Keyword and emoji cannot be null.");
        }
        emojiTable.put(keyword, emoji);
    }

    /**
     * Retrieves an emoji for a given keyword.
     * 
     * @param keyword The keyword to search in the emoji table.
     * @return The emoji if found, or null if no mapping exists.
     */
    public String getEmoji(String keyword) {
        return emojiTable.get(keyword);
    }

    /**
     * Checks if a keyword exists in the emoji table.
     * 
     * @param keyword The keyword to check.
     * @return True if the keyword exists, false otherwise.
     */
    public boolean containsKeyword(String keyword) {
        return emojiTable.containsKey(keyword);
    }

    /**
     * Gets the entire emoji table for reference.
     * 
     * @return The HashMap containing all emoji mappings.
     */
    public HashMap<String, String> getEmojiTable() {
        return emojiTable;
    }

    /**
     * Removes an emoji mapping by its keyword.
     * 
     * @param keyword The keyword of the mapping to remove.
     * @return True if the mapping was successfully removed, false if it does not exist.
     */
    public boolean removeEmoji(String keyword) {
        if (emojiTable.containsKey(keyword)) {
            emojiTable.remove(keyword);
            return true;
        }
        return false;
    }

    /**
     * Initializes the emoji table with some default emoji mappings.
     */
    private void initializeDefaultEmojis() {
        addEmoji("happy", "😊");
        addEmoji("sad", "😢");
        addEmoji("love", "❤️");
        addEmoji("angry", "😠");
        addEmoji("laugh", "😂");
    }

    /**
     * Prints all emoji mappings to the console. Useful for debugging or testing.
     */
    public void printEmojiMappings() {
        if (emojiTable.isEmpty()) {
            System.out.println("The emoji table is empty.");
        } else {
            System.out.println("Current emoji mappings:");
            emojiTable.forEach((keyword, emoji) -> System.out.println(keyword + " -> " + emoji));
        }
    }
}
