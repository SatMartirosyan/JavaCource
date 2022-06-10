package com.company.copy_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

class Home extends JFrame implements ActionListener{

    Container container = getContentPane();
    JLabel home = new JLabel("HOME",JLabel.CENTER);
    JButton playbutton = new JButton("PLAY");
    JButton exitbutton = new JButton("EXIT");

    Home(){
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setLayoutManager(){
        // Content panes use
        // BorderLayout by default
        container.setLayout(null);
    }
    public void setLocationAndSize(){
        // position and size of the components
        // using setBounds(x,y,width,height)
        home.setBounds(125,20,125,30);
        // to display content or BackGround
        // behind a given component
        home.setOpaque(true);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        playbutton.setBounds(75,200,225,30);
        exitbutton.setBounds(75,250,225,30);
    }
    public void addComponentsToContainer(){
        container.add(home);
        container.add(playbutton);
        container.add(exitbutton);
    }
    public void addActionEvent(){
        // listen for changes on the object
        playbutton.addActionListener(this);
        exitbutton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == playbutton){
            // dispose() method clear
            // resources at each frame
            dispose();
            // to call the constructor of class Play
            Game frame = new Game();
            // Sets the title for this frame "PLAY"
            frame.setTitle("PLAY");
            // Component will be displayed on the screen
            frame.setVisible(true);
            // position and size of the frame
            // using setBounds(x,y,width,height)
            frame.setBounds(10,10,370,600);
            // application exits on close window
            // event from the operating system
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            // user cannot re-size the frame
            frame.setResizable(false);
        }
        if(e.getSource() == exitbutton){
            // asks for confirmation from the user to exit or not
            int option = JOptionPane.showConfirmDialog(this,"Do You Really Want To Quit","Thank you", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                dispose();
            }
        }
    }
}

