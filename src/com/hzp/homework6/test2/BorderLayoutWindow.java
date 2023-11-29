package com.hzp.homework6.test2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class BorderLayoutWindow {    
      public static void main(String args[]) {
    	JFrame frame=new JFrame();
    	frame.setSize(300, 200);
    	frame.setLocation(300, 200);
    	frame.setLayout(new BorderLayout());   
    	frame.add(new Button("BN"), "North");       
    	frame.add( new Button("BS"),"South");
    	frame.add( new Button("BE"),"East");
    	frame.add( new Button("BW"),"West");
    	frame.add( new Button("BC"),"Center");
    	frame.setTitle("BorderWindow");
        frame.setVisible(true);
		frame.addWindowListener(new MyWindowListener());
	}
}
class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}
