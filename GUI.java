
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The GUI class provides a graphical user interface for the Emoji Translator
 * application. It allows users to input text, translate it to emoji, and view
 * the result.
 */
public class GUI {

    private EmojiManager emojiManager;
    private Translate translator;

    /**
     * Constructor for the GUI that initializes the EmojiManager and Translator.
     */
    public GUI() {
        // Initialize EmojiManager and Translator
        emojiManager = new EmojiManager();
        translator = new Translate(emojiManager);

        // Add some sample emoji mappings
        emojiManager.addEmoji("happy", "😊");
        emojiManager.addEmoji("sad", "😢");
        emojiManager.addEmoji("love", "❤️");
        emojiManager.addEmoji("angry", "😠");
        emojiManager.addEmoji("laugh", "😂");
    }

    /**
     * Launches the graphical interface for the Emoji Translator.
     */
    public void launch() {
        // Create the main frame
        JFrame frame = new JFrame("Emoji Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // Create a panel for input and output
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        // Input components
        JLabel inputLabel = new JLabel("Enter Text:");
        JTextField inputField = new JTextField();

        // Output components
        JLabel outputLabel = new JLabel("Translation:");
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        // Add input and output components to the panel
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(outputLabel);
        panel.add(new JScrollPane(outputArea));

        // Add the panel to the center of the frame
        frame.add(panel, BorderLayout.CENTER);

        // Add a button for translation
        JButton translateButton = new JButton("Translate");
        frame.add(translateButton, BorderLayout.SOUTH);

        // Add action listener for the button
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input
                String userInput = inputField.getText();

                // Process the input through the Translator
                String translation = translator.translator(userInput, emojiManager);

                // Display the translated output
                outputArea.setText(translation);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    /**
     * Main method to run the Emoji Translator GUI.
     */
    public static void main(String[] args) {
        // Launch the GUI
        new GUI().launch();
    }
}
