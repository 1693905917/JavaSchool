package com.hzp.homework6.test3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class GridLayoutWindow extends JFrame {
	public GridLayoutWindow() {
		setLayout(new GridLayout(3, 2));
		add(new Button("b1"));
		add(new Button("b2"));
		add(new Button("b3"));
		add(new Button("b4"));
		add(new Button("b5"));
		add(new Button("b6"));
	}

	public static void main(String args[]) {
		GridLayoutWindow window = new GridLayoutWindow();
		window.setSize(300, 150);
		window.setLocation(200, 200);
		window.setTitle("GridLayout Example");
		window.setVisible(true);
		window.addWindowListener(new MyWindowListener());
	}
}

class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}
