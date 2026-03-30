package game;

import javax.swing.SwingUtilities;

/**
 * Entry point for the Rally Game prototype.
 */
public class RallyLauncher {

    public static void main(String[] args) {
        // --- Swing Thread Safety ---
        // All Swing component creation and modification should happen
        // on the Event Dispatch Thread (EDT) to prevent rare bugs.
        SwingUtilities.invokeLater(() -> {
            // 1. Instantiate the main window
            RallyGameWindow window = new RallyGameWindow();

            // 2. Make the window visible
            window.setVisible(true);
        });
    }
}