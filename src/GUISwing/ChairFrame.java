package GUISwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChairFrame extends JFrame{

    ChairFrame() {

        ImageIcon image = new ImageIcon("chair_logo.png"); // Create the image icon that has been copied into the project.
        this.setIconImage(image.getImage()); // Set the icon of our frame to this newly create image.
        Border border = BorderFactory.createLineBorder(Color.black, 5); // Creates a border to use in our label

        // Panels
        JPanel bluePanel = new JPanel();
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,0,250,250);
        redPanel.setBackground(Color.red);
        redPanel.setBounds(250,0,250,250);
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,250,250);
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(250,250,250,250);



        // Labels
        JLabel label = new JLabel(); // create new label
        label.setText("I am a chair"); // set the text of the label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Sets text Center, Right, or Left of the image
        label.setVerticalTextPosition(JLabel.TOP); // Sets the text on top or bottom of image\
        label.setForeground(Color.blue); // Set color of font
        label.setFont(new Font("MV Boli", Font.ITALIC, 20)); // Set font text
        label.setIconTextGap(20); // Set space between the text and image
        label.setBackground(Color.white); // Sets the background color of the text
        label.setOpaque(true); // Allows the color to show. (By default the label takes up the entire window so the whole box uses the background color.)
        label.setBorder(border); // Set the border of our labels frame
        label.setVerticalAlignment(JLabel.CENTER); // Sets the vertical position of items within the label
        label.setHorizontalAlignment(JLabel.CENTER); // Sets the horizontal position of items within the label
        label.setBounds(100,100,250,250); // Set x and y position within the frame and it's dimensions

        // JFrame
        this.add(label); // Adds label to frame
        this.add(bluePanel);
        this.add(redPanel);
        this.add(greenPanel);
        this.add(yellowPanel);

        this.setTitle("Chairforce"); // Set the title
        this.setSize(515,539); // Set starting width and height of the this.
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //One of the option, this allows you to exit program once clicking "X"
        this.setResizable(true); // Prevents use from changing the size of the this.
        this.setVisible(true); // this is now visible.
        //this.getContentPane().setBackground(new Color(255,255,255)); // Setting background color using RGB.


    }

}
