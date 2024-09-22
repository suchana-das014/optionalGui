import javax.swing.JFrame;

public class TestDraw {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel(); // Ensure this class is properly defined
        JFrame app = new JFrame("Draw Panel Test"); // Give the frame a title
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null); // Center the frame on the screen
        app.setVisible(true); // Make the frame visible
    }
}
