package com.company;

import javax.swing.*;

public class GUI extends JFrame{

    Controller[] controllers;

        public GUI() {
            setSize(800, 600);
            setTitle("Synthia");
        }

        public static void main(String[] args) {
           GUI GuiWindow = new GUI();
            GuiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GuiWindow.setVisible(true);
        }

}
