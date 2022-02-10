package GUIButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton attackButton;
    JButton healButton;
    JButton shieldButton;

    JProgressBar bar = new JProgressBar();

    MyFrame() {

//        ImageIcon swordIcon = new ImageIcon("sword.png");
//        swordIcon.setIcon();

        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));

        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));

        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));

        //label.setIcon(imageIcon);

        attackButton = new JButton();
        attackButton.setBounds(400,200, 200, 150);
        attackButton.addActionListener(this);
        attackButton.setFocusable(false);
        attackButton.setIcon(swordIcon);

        //attackButton.setForeground(Color.DARK_GRAY);
        //attackButton.setText("Attack");
        //attackButton.setHorizontalTextPosition(JButton.CENTER);
        //attackButton.setVerticalTextPosition(JButton.BOTTOM);
        //attackButton.setFont(new Font("Comic Sans", Font.BOLD, 30));
        //attackButton.setIconTextGap(0);

        healButton = new JButton();
        healButton.setBounds(700,200, 200, 150);
        healButton.addActionListener(this);
        healButton.setFocusable(false);
        healButton.setIcon(healingIcon);

        shieldButton = new JButton();
        shieldButton.setBounds(100,200, 200, 150);
        shieldButton.addActionListener(this);
        shieldButton.setFocusable(false);
        shieldButton.setIcon(shieldIcon);


        bar.setValue(100);
        bar.setForeground(Color.red);
        bar.setBounds(100,50,400,50);
        bar.setStringPainted(true);
        bar.setString("100/100");
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        //button.setBackground(Color.RED);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.add(attackButton);
        this.add(bar);
        this.add(healButton);
        this.add(shieldButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == attackButton) {
            System.out.println("You attack your target and deal 10 damage!");
            this.setSize(700,700);

            if(bar.getValue() > 0) {
                bar.setValue(bar.getValue() - 10);
                bar.setString(bar.getValue() + "/100");
            }

            if(bar.getValue() < 1) {
                attackButton.setEnabled(false);
            }

        }

    }

}
