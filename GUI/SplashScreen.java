package GUI;


//SplashScreen.java
//A simple application to show a title screen in the center of the screen
//for the amount of time given in the constructor.  This class includes
//a sample main() method to test the splash screen, but it's meant for use
//with other applications.
//

import java.awt.*;

import javax.swing.*;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class SplashScreen extends JWindow {
	private int duration;
	private String ruta;
	private int x;
	private int y;
	public SplashScreen(int d, String r, int x, int y) {
		duration = d;
		ruta = r;
		this.x = x;
		this.y = y;
	}

	// A simple little method to show a title screen in the center
	// of the screen for the amount of time given in the constructor
	public void showSplash() {
		this.setLocationByPlatform(true);
		 JPanel content = (JPanel)getContentPane();
		 content.setBackground(new java.awt.Color(191,191,191));
		 content.setLayout(null);
		 JLabel label = new JLabel();
		 // Set the window's bounds, centering the window
		 Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		 this.setBounds(x, y, 700, 880);
		
		 // Build the splash screen

		 
		 content.add(label);
		 label.setIcon(new ImageIcon(getClass().getResource(ruta)));
		 label.setBounds(0, 0, 700, 880);

		 // Display it
		 setVisible(true);
		
		 // Wait a little while, maybe while loading resources
		 try { Thread.sleep(duration); } catch (Exception e) {}
		
		 setVisible(false);
		 getContentPane().setBackground(new java.awt.Color(0,0,0));
		 this.setOpacity(0.0f);
		 content.add(label, "West");
	}

	public void showSplashAndExit() {
		showSplash();
		
	}

}
