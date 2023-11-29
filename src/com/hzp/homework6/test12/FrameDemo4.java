package com.hzp.homework6.test12;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FrameDemo4 {
	public static void main(String[] args)
	{
	// 创建窗体对象
	final Frame f = new Frame("更改窗口的背景色");
	// 设置窗体属性和布局
	f.setBounds(400, 200, 400, 300);
	f.setLayout(new FlowLayout());
	// 创建四个按钮
	Button redButton = new Button("红色");
	Button greenButton = new Button("绿色");
	Button buleButton = new Button("蓝色");
	// 添加按钮
	f.add(redButton);
	f.add(greenButton);
	f.add(buleButton);
	// 设置窗体关闭
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	// 对按钮添加鼠标的进入事件
	redButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			f.setBackground(Color.RED);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			f.setBackground(Color.WHITE);
		}
	});
	greenButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
		f.setBackground(Color.GREEN);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			f.setBackground(Color.WHITE);
		}
	});
	buleButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			f.setBackground(Color.BLUE);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			f.setBackground(Color.WHITE);
		}
	});
	// 设置窗体显示
	f.setVisible(true);
}}