package com.company;

import javax.swing.*;

public class GUI extends JFrame{
// lubie kaszztany daj komit
        public static void main(String[] args) {
            GUI mainGui = new GUI();
            mainGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainGui.setSize(800,600);
            mainGui.setTitle("Synthia v.1.0");

            mainGui.setVisible(true);
        }
}


