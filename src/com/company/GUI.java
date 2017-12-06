package com.company;

import javax.swing.*;

public class GUI extends JFrame {
    // jak pdac push
   public Controller[] _controls;
   String[] button_Names;
    int[] coordinates;



        void controls_add() {

            for (int i = 0; i < button_Names.length; i++) {
                _controls[i] = new Knob(button_Names[i],coordinates[i], coordinates[i]);
            }
        }

        public GUI()
    {

        button_Names = new String[]{"Compressor", "Reverb", "Echo"};
        coordinates = new int[]{22,66,77,44,55,66};

    }

        public static void main(String[] args) {

            AudioHandle SND = new AudioHandle();
            SND.loadData( "C:/Users/Janek/Desktop/plik.wav");
            SND.playFile();

           // SND.playsound("C:/Users/Janek/Desktop/plik.wav"); // ta funkcja odtwarza plik, poki co plik musi byc maly, dla duzych nie odtwarza
            GUI mainGui = new GUI();

            mainGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainGui.setSize(800,600);
                    mainGui.setTitle("Synthia v.1.0");
            mainGui.setVisible(true);
            mainGui.controls_add();
            mainGui.setVisible(true);


        }
}


