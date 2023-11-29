package com.hzp.homework6.test8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MenuTest{
	public static void main(String args[]){
		Frame fr=new Frame("Menu");
		fr.setSize(300, 300);
		fr.setLocation(200, 300);
		MenuBar mb=new MenuBar();
		fr.setMenuBar(mb);
		Menu m1=new Menu("File");
		Menu m2=new Menu("Format");
		Menu m3=new Menu("Help");
		Menu m4=new Menu("进制");
		mb.add(m1);
		mb.add(m2);
		mb.setHelpMenu(m3);
		MenuItem m21=new MenuItem("中文");
		MenuItem m41=new MenuItem("二进制");
		MenuItem m42=new MenuItem("八进制");
		MenuItem m43=new MenuItem("十进制");
		m2.add(m21);
		m2.add(m4);
		m4.add(m41);
		m4.add(m42);
		m4.add(m43);
		fr.pack();
		fr.setVisible(true);
		fr.addWindowListener(new MyWindowListener());
	}
}

class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}
