
/*
 * Project: Emoji Translator
 * Author: Ellie Earwood
 * Date: 12/04/2024
 * Description: This class manages the creation and retrieval of emojis in the translator.
 */

package emoji.translator;

import java.util.HashMap;

public class EmojiManager {
    // A HashMap to store emoji mappings
    private HashMap<String, String> emojiTable;

    /**
     * Default constructor to initialize the emoji table.
     */
    public EmojiManager() {
        emojiTable = new HashMap<>();
    }

    /**
     * Adds a new emoji mapping to the table.
     * @param keyword The keyword to be replaced with an emoji.
     * @param emoji The emoji to map to the keyword.
     */
    public void addEmoji(String keyword, String emoji) {
        emojiTable.put(keyword, emoji);
    }

    /**
     * Retrieves an emoji for a given keyword.
     * @param keyword The keyword to search in the emoji table.
     * @return The emoji if found, or null if no mapping exists.
     */
    public String getEmoji(String keyword) {
        return emojiTable.get(keyword);
    }

    /**
     * Checks if a keyword exists in the emoji table.
     * @param keyword The keyword to check.
     * @return True if the keyword exists, false otherwise.
     */
    public boolean containsKeyword(String keyword) {
        return emojiTable.containsKey(keyword);
    }

    /**
     * Gets the entire emoji table for reference.
     * @return The HashMap containing all emoji mappings.
     */
    public HashMap<String, String> getEmojiTable() {
        return emojiTable;
    }
}
