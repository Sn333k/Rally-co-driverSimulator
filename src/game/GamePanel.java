package game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private final CarObject car;
    private final Timer gameTimer;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.GRAY);
        car = new CarObject(100, 300);

        // Game Loop: runs every 16ms (~60 FPS)
        gameTimer = new Timer(16, e -> {
            car.update(0.016); // 0.016s is the delta time
            repaint();
        });
        gameTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        car.draw(g2d);
        drawHUD(g2d);
    }

    private void drawHUD(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillRect(10, 10, 150, 50);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d.drawString("SPEED: " + (int)car.getSpeed() + " km/h", 20, 32);

//        if (car.isWaiting()) {
//            g2d.setColor(Color.YELLOW);
//            g2d.setFont(new Font("Arial", Font.ITALIC, 14));
//            g2d.drawString("WAITING FOR COMMAND...", 20, 50);
//        }
    }

    public CarObject getCar() { return car; }
}