package snakeGame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JFrame {

Game() {
    add(new Board());
    setResizable(false);
    pack();
    setTitle("Catch the Reindeer!");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) {

    // Creates a new thread so our GUI can process itself
    EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame frame = new Game();
            frame.pack();
            frame.setVisible(true);
        }
    });
}
}