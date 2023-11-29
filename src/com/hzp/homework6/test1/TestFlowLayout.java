package com.hzp.homework6.test1;

import java.awt.*;
	public class TestFlowLayout {
		public static void main(String args[]) {
			Frame f = new Frame("Flow Layout");
			Button button1 = new Button("确定");
			Button button2 = new Button("打开");
			Button button3 = new Button("关闭");
			Button button4 = new Button("取消");
			f.setLayout(new FlowLayout());
			f.add(button1);
			f.add(button2);
			f.add(button3);
			f.add(button4);
			f.setSize(100,100);
			f.setVisible(true);
	}
}