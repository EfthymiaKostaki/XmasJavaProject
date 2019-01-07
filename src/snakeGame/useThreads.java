package XmasProject;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class useThreads {
	public static void main(String args[]) {
		XmasCard xc = new XmasCard();
		xc.start();
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
