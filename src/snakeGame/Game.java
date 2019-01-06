package XmasJavaProject;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Game extends JFrame {

Game() {
    add(new Board());
    setResizable(false);
    pack();
    setTitle("Catch the Reindeer!");
    setLocation(600,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
