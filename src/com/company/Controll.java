package com.company;

import javax.swing.*;

public class Controll extends JFrame{
    float value;
    int  pos_in_window_x;
    int  pos_in_window_y;

    float check_value(){
        return this.value;
    }


    public Controll(){

        JButton c1= new JButton ("number");
        c1.setBounds(pos_in_window_x, pos_in_window_y, 80, 20 );

    }
}
