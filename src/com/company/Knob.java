package com.company;
import javax.swing.*;

public class Knob extends Controller {
    JButton _button;
    JPanel _panel;
    public char name;
public Knob(String name, int xcor, int ycor) {
    _button = new JButton(); // musi zwracac na zewnatrz
    _panel = new JPanel();
    _panel.setLayout(null);
    _button.setLayout(null);
    _panel.add(_button);
    add(_panel);
    _panel.setLocation(xcor,ycor);

}



}





