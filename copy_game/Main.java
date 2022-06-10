package com.company.copy_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class Main {
    public static void main(String[] arg){
        // to call the constructor of class Home
        Home frame = new Home();
        // Sets the title for this frame "HOME"
        frame.setTitle("HOME");
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
}