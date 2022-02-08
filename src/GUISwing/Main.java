package GUISwing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); //creates a frame

        frame.setTitle("Chairforce Frame"); // Set the title
        frame.setSize(420,420); // Set starting width and height of the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //One of the option, this allows you to exit program once clicking "X"
        frame.setResizable(false); // Prevents use from changing the size of the frame.
        frame.setVisible(true); // Frame is now visible.



    }



}
