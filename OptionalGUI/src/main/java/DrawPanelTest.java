// Fig. 4.19: DrawPanelTest.java
// Creating JFrame to display DrawPanel.

import javax.swing.JFrame;

public class DrawPanelTest {  // Fixed class name and declaration

    public static void main(String[] args) {
        // Create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();  // Fixed variable declaration

        // Create a new frame to hold the panel
        JFrame application = new JFrame();  // Fixed variable declaration

        // Set the frame's properties
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);  // Add the panel to the frame
        application.setSize(300, 300);  // Set the size of the frame
        application.setVisible(true);  // Make the frame visible
    }
}
