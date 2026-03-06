import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    static void main() {
        JFrame frame = new JFrame("Test Map");
        frame.add(new Map(), BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
