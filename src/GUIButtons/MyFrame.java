package GUIButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton attackButtonP1;
    JButton healButtonP1;
    JButton shieldButtonP1;
    JButton attackButtonP2;
    JButton healButtonP2;
    JButton shieldButtonP2;

    JProgressBar healthPointsP1 = new JProgressBar();
    JProgressBar healthPointsP2 = new JProgressBar();

    MyFrame() {

        playerOne();
        playerTwo();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setVisible(true);
        this.add(attackButtonP1);
        this.add(healthPointsP1);
        this.add(healButtonP1);
        this.add(shieldButtonP1);
        this.add(attackButtonP2);
        this.add(healthPointsP2);
        this.add(healButtonP2);
        this.add(shieldButtonP2);
        this.add(healthPointsP2);

    }

    private void playerOne () {
        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        attackButtonP1 = new JButton();
        attackButtonP1.setBounds(100,200, 125, 125);
        attackButtonP1.addActionListener(this);
        attackButtonP1.setFocusable(false);
        attackButtonP1.setIcon(swordIcon);

        healButtonP1 = new JButton();
        healButtonP1.setBounds(500,200, 125, 125);
        healButtonP1.addActionListener(this);
        healButtonP1.setFocusable(false);
        healButtonP1.setIcon(healingIcon);

        shieldButtonP1 = new JButton();
        shieldButtonP1.setBounds(300,200, 125, 125);
        shieldButtonP1.addActionListener(this);
        shieldButtonP1.setFocusable(false);
        shieldButtonP1.setIcon(shieldIcon);

        healthPointsP1.setValue(100); // Variable
        healthPointsP1.setBounds(100,50,525,50);
        healthPointsP1.setStringPainted(true);
        healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP1.getMaximum()); // variable dependent
        healthPointsP1.setForeground(Color.red);
        healthPointsP1.setBackground(Color.black);

    }

    private void playerTwo () {

        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        attackButtonP2 = new JButton();
        attackButtonP2.setBounds(1270,200, 125, 125);
        attackButtonP2.addActionListener(this);
        attackButtonP2.setFocusable(false);
        attackButtonP2.setIcon(swordIcon);

        healButtonP2 = new JButton();
        healButtonP2.setBounds(1670,200, 125, 125);
        healButtonP2.addActionListener(this);
        healButtonP2.setFocusable(false);
        healButtonP2.setIcon(healingIcon);

        shieldButtonP2 = new JButton();
        shieldButtonP2.setBounds(1470,200, 125, 125);
        shieldButtonP2.addActionListener(this);
        shieldButtonP2.setFocusable(false);
        shieldButtonP2.setIcon(shieldIcon);

        healthPointsP2.setValue(100); // variable dependent
        healthPointsP2.setBounds(1270,50,525,50);
        healthPointsP2.setStringPainted(true);
        healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum()); // variable dependent
        healthPointsP2.setForeground(Color.red);
        healthPointsP2.setBackground(Color.black);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == attackButtonP1) {
            System.out.println("You attack your target and deal 10 damage!");

            if(healthPointsP2.getValue() > 0) {
                healthPointsP2.setValue(healthPointsP2.getValue() - 10); // variable dependent
                healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum());
            }

            if(healthPointsP2.getValue() <= 0) {
                attackButtonP1.setEnabled(false);
            }

        }

        if(e.getSource() == attackButtonP2) {
            System.out.println("You attack your target and deal 10 damage!");

            if(healthPointsP1.getValue() > 0) {
                healthPointsP1.setValue(healthPointsP1.getValue() - 10); // variable dependent
                healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP1.getMaximum());
            }

            if(healthPointsP1.getValue() <= 0) {
                attackButtonP2.setEnabled(false);
            }

        }

        if(e.getSource() == healButtonP1) {

            if(healthPointsP1.getValue() < healthPointsP1.getMaximum()) {
                healthPointsP1.setValue(healthPointsP1.getValue() + 30); // Change 30 to a passed in value.
                System.out.println("You have healed 30 points of damage!");
            } else {
                System.out.println("You are already full health.");
            }

            healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP2.getMaximum());

            }

        if(e.getSource() == healButtonP2) {

            if(healthPointsP2.getValue() < healthPointsP2.getMaximum()) {
                healthPointsP2.setValue(healthPointsP2.getValue() + 30); // Change 30 to a passed in value.
                System.out.println("You have healed 30 points of damage!");
            } else {
                System.out.println("You are already full health.");
            }

            healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum());

            }
        }
    }

