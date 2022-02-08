package GUISwing;

import javax.swing.*;
import java.awt.*;

public class ChairFrame extends JFrame{

    ChairFrame() {

        this.setTitle("Chairforce"); // Set the title
        this.setSize(420,420); // Set starting width and height of the this.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //One of the option, this allows you to exit program once clicking "X"
        this.setResizable(false); // Prevents use from changing the size of the this.
        this.setVisible(true); // this is now visible.

        ImageIcon image = new ImageIcon("chair_logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,0,255));
    }

}
