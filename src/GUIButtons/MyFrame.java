package GUIButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton attackButton;
    JButton healButton;
    JButton shieldButton;

    JProgressBar playerOneHP = new JProgressBar();
    JProgressBar playerTwoHP = new JProgressBar();

    MyFrame() {

        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));

        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));

        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));


        attackButton = new JButton();
        attackButton.setBounds(400,200, 200, 150);
        attackButton.addActionListener(this);
        attackButton.setFocusable(false);
        attackButton.setIcon(swordIcon);

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

        playerOneHP.setValue(100);
        playerOneHP.setForeground(Color.red);
        playerOneHP.setBounds(100,50,400,50);
        playerOneHP.setStringPainted(true);
        playerOneHP.setString("100/100");
        playerOneHP.setForeground(Color.red);
        playerOneHP.setBackground(Color.black);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.add(attackButton);
        this.add(playerOneHP);
        this.add(healButton);
        this.add(shieldButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == attackButton) {
            System.out.println("You attack your target and deal 10 damage!");
            //this.setSize(700,700);

            if(playerOneHP.getValue() > 0) {
                playerOneHP.setValue(playerOneHP.getValue() - 10);
                playerOneHP.setString(playerOneHP.getValue() + "/100");
            }

            if(playerOneHP.getValue() < 1) {
                attackButton.setEnabled(false);
            }

        }

        if(e.getSource() == healButton) {
            System.out.println("You have healed 30 points of damage!");
            //this.setSize(700,700);

            if(playerOneHP.getValue() < 100) {
                playerOneHP.setValue(playerOneHP.getValue() + 30); // Change 30 to a passed in value.
            } else {
                playerOneHP.setValue(100);
                }


            if(playerOneHP.getValue() == 100) {
                healButton.setEnabled(false);
            }

            playerOneHP.setString(playerOneHP.getValue() + "/100");

            }
        }
    }

