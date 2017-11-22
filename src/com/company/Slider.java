package com.company;
import javax.swing.*;
public class Slider extends Controller {

    private JSlider slider;
    private JLabel sl;
    public Slider(){
        slider = new JSlider();
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);

    }

}
