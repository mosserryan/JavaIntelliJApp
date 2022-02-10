package GUIButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    JProgressBar bar = new JProgressBar();

    MyFrame() {

//        ImageIcon swordIcon = new ImageIcon("sword.png");
//        swordIcon.setIcon();

        ImageIcon imageIcon = new ImageIcon(new ImageIcon("sword.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        //label.setIcon(imageIcon);

        button = new JButton();
        button.setBounds(200,200, 200, 130);
        button.addActionListener(this);
        button.setText("Attack");
        button.setFocusable(false);
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(25);
        button.setForeground(Color.DARK_GRAY);
        bar.setValue(50);
        bar.setForeground(Color.red);
        bar.setBounds(100,50,400,50);
        //button.setBackground(Color.RED);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,700);
        this.setVisible(true);
        this.add(button);
        this.add(bar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {
            System.out.println("I've been pressed!");
            this.setSize(700,700);

            if(bar.getValue() > 0) {
                bar.setValue(bar.getValue() - 10);
            } else {
                button.setEnabled(false);
            }

        }

    }

}
