package XmasProject;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * The Christmas Card program main class.
 *
 * @author Giorgos Gousios, Diomidis Spinellis
 * @depend - - - gr.aueb.xmascard.DrawPanel
 * @depend - <instantiate> - gr.aueb.xmascard.MidiPlayer
 * @depend - - - gr.aueb.xmascard.Tree
 * @depend - - - gr.aueb.xmascard.PointSnowFlake
 * @depend - - - gr.aueb.xmascard.SlashSnowFlake
 */
public class XmasCard  extends Thread{

    /** Number of trees */
    private static final int numTrees = 30;
    /** Number of snowflakes */
    private static final int numSnowFlakes = 1500;
    /** Minimum tree width. */
    private static final int treeWidth = 30;
    /** Minimum tree height. */
    private static final int treeHeight = 100;
    /** Additional variation to tree height and width */
    private static final int treeWobble = 100;
    /** Song to play. */
    private static String musicFile = "C:\\Users\\kosta\\Downloads\\christmassong.mp3";

    public  void run() {

        // Create a window and the canvas to draw onto.
        DrawPanel d = new DrawPanel();
        
        // Create randomly-positioned trees.
        for (int i = 0; i < numTrees; i++) {
            Rectangle treeBox = new Rectangle(
            	(int)(Math.random() * DrawPanel.WIDTH),
                (int)(Math.random() * DrawPanel.HEIGHT),
                treeWidth + (int)(Math.random() * treeWobble),
                treeHeight + (int)(Math.random() * treeWobble));

            Tree t = new Tree(d.getCanvas(), treeBox);
            d.addDrawObject(t);
        }

        // Start playing music
        MidiPlayer m = new MidiPlayer(musicFile);

        // Create the snowflakes.
        for (int i = 0; i < numSnowFlakes; i++) {
        	switch (i % 6) {
        	case 0:
        	case 1:
        		d.addDrawObject(new PointSnowFlake(d.getCanvas(), '.', 15));
        		break;
        	case 2:
        		d.addDrawObject(new PointSnowFlake(d.getCanvas(), 'o', 10));
        		break;
        	case 3:
                d.addDrawObject(new PointSnowFlake(d.getCanvas(), '*', 5));
                break;
        	case 4:
        	case 5:
                d.addDrawObject(new SlashSnowFlake(d.getCanvas()));
                break;
        	}
        	try {
		// Allow existing snowflakes to fall a bit, before adding more
        		Thread.sleep(100);
        		
           
        		} catch (InterruptedException e) {
        		}
        }
    }
}
