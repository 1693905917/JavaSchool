package com.hzp.homework6.test4;

import java.awt.*;
import java.awt.event.*;
public class TestActionEvent {
    public static void main(String args[]) {
    Frame f = new Frame("Test");
    Button b = new Button("Press Me!");
    Monitor bh = new Monitor();
    b.addActionListener(bh);
    f.add(b,BorderLayout.CENTER);
    f.pack();
    f.setVisible(true);
    }
} 
class Monitor implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    System.out.println("a button has been pressed");
}
}