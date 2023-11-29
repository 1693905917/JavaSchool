package com.hzp.homework6.test14;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Calc implements ActionListener {
	private Frame Fm = new JFrame();
	private JButton quit = new JButton("退出");
	private JButton Add = new JButton("+");
	private JButton Sub = new JButton("-");
	private JButton Mul = new JButton("×");
	private JButton Div = new JButton("÷");
	private Label Addend = new Label("操作数：");
	private Label Augend = new Label("操作数：");
	private Label Result = new Label("结果");
	private TextField fieldAdd = new TextField();
	private TextField fieldAug = new TextField();
	private TextField areaResult = new TextField();
	private Font Ft = new Font("宋体", Font.BOLD, 18);

	public Calc() {
		Fm.setTitle("简单计算器");
		Fm.setLayout(null);
		Fm.setBounds(200, 100, 400, 300);
		Addend.setBounds(20, 70, 60, 30);
		Fm.add(Addend);// 标签--操作数1
		Addend.setFont(Ft);// 字体类型
		fieldAdd.setBounds(100, 70, 140, 30);
		Fm.add(fieldAdd);// 输入区--操作数1
		fieldAdd.setFont(Ft);// 字体类型
		Augend.setBounds(20, 120, 60, 30);
		Fm.add(Augend);// 标签--操作数2
		Augend.setFont(Ft);
		fieldAug.setBounds(100, 120, 140, 30);
		Fm.add(fieldAug);// 输入区--操作数2
		fieldAug.setFont(Ft);
		Result.setBounds(20, 170, 60, 30);
		Fm.add(Result);// 标签--结果
		Result.setFont(Ft);
		areaResult.setBounds(100, 170, 140, 30);
		Fm.add(areaResult);
		areaResult.setFont(Ft);
		Add.setBounds(260, 50, 100, 30);
		Fm.add(Add);
		Add.addActionListener(this);
		Sub.setBounds(260, 90, 100, 30);
		Fm.add(Sub);
		Sub.addActionListener(this);
		Mul.setBounds(260, 130, 100, 30);
		Fm.add(Mul);
		Mul.addActionListener(this);
		Div.setBounds(260, 170, 100, 30);
		Fm.add(Div);
		Div.addActionListener(this);
//退出  
		quit.setBounds(260, 210, 100, 30);
		Fm.add(quit);
		quit.addActionListener(this);
		Fm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		double a, b;
		a = Double.parseDouble(fieldAdd.getText());
		b = Double.parseDouble(fieldAug.getText());
		try {
			if (e.getSource() == quit)
				System.exit(0);
			else if (e.getSource() == Add)
				areaResult.setText(String.valueOf(a + b));
			else if (e.getSource() == Sub)
				areaResult.setText(String.valueOf(a - b));
			else if (e.getSource() == Mul)
				areaResult.setText(String.valueOf(a * b));
			else if (e.getSource() == Div)
				areaResult.setText(String.valueOf(a / b));
		} catch (Exception Ex) {
			areaResult.setText("出错了：" + Ex);
		}
	}

	public static void main(String args[]) {
		Calc call = new Calc();
	}
}
