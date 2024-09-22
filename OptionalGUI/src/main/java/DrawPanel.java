// Fig. 4.18: DrawPanel.java
// Using drawLine to connect the corners of a panel.

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    // Draws an X from the corners of the panel
    @Override
    protected void paintComponent(Graphics g) {
        // Call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth();  // total width
        int height = getHeight(); // total height

        // Draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // Draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);
    }
}
