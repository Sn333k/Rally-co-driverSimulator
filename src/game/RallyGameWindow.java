package game;

import javax.swing.*;
import java.awt.*;
import grammar.*;
import org.antlr.v4.runtime.*;
import interpreter.RallyVisitor;
/**
 * Updated main window with a command input field at the bottom.
 */
public class RallyGameWindow extends JFrame {

    private final GamePanel gamePanel;
    private final JTextField commandField;

    public RallyGameWindow() {
        // --- Window Configuration ---
        setTitle("Rally Game 2D - Input Ready");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout to organize the panel and the input field
        setLayout(new BorderLayout());

        // --- Initialize Components ---
        gamePanel = new GamePanel();

        // Create the input area
        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(" Enter Command: ");
        commandField = new JTextField();

        // Add components to the input panel
        inputPanel.add(label, BorderLayout.WEST);
        inputPanel.add(commandField, BorderLayout.CENTER);

        // --- Add to Window ---
        add(gamePanel, BorderLayout.CENTER); // Game graphics in the middle
        add(inputPanel, BorderLayout.SOUTH);  // Text input at the bottom

        // --- Event Handling ---
        // This listener triggers when you press 'ENTER' in the text field
        commandField.addActionListener(e -> {
            handleCommand(commandField.getText());
            commandField.setText("");
        });

        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This is where the magic will happen.
     * For now, it just prints to console and moves the car slightly for testing.
     */
    private void handleCommand(String text) {
        if (text.isEmpty()) return;

        try {
            // 1. Create a stream of characters from the input text
            org.antlr.v4.runtime.CharStream input = org.antlr.v4.runtime.CharStreams.fromString(text);

            // 2. Feed the characters to the Lexer
            grammar.RallyComLexer lexer = new grammar.RallyComLexer(input);

            // 3. Create a buffer of tokens
            org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);

            // 4. Create the Parser
            grammar.RallyComParser parser = new grammar.RallyComParser(tokens);

            // 5. Build the Parse Tree starting from the 'program' rule
            org.antlr.v4.runtime.tree.ParseTree tree = parser.program();

            // 6. Use our Visitor to execute actions
            RallyVisitor visitor = new RallyVisitor(gamePanel.getCar());
            visitor.visit(tree);

            // 7. Refresh the screen
            gamePanel.repaint();

        } catch (Exception ex) {
            System.err.println("Error parsing command: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Błąd komendy: " + ex.getMessage());
        }
    }
}