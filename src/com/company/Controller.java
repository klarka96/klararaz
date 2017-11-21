package com.company;

import javax.swing.*;

public class Controller extends JFrame{
    float value;
    int  pos_in_window_x;
    int  pos_in_window_y;
    int minVal, maxVal, initialVal;

    float check_value(){
        return this.value;
    }


    public Controller(){

        JButton c1= new JButton ("number");
        c1.setBounds(pos_in_window_x, pos_in_window_y, 80, 20 );
        add(c1);
    }
}
