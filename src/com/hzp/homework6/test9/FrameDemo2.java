package com.hzp.homework6.test9;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * 步骤如下:
 * 1：创建窗体对象
 * 2: 创建按钮对象
 * 3: 把按钮添加到窗体
 * 4: 窗体显口
 */
public class FrameDemo2 {
    public static void main(String[] args) {
// 创建窗体对象
        Frame f = new Frame("添加按钮");
// 设置属性
        f.setBounds(400, 200, 400, 300);
// 设置布局为流式布局
        f.setLayout(new FlowLayout());
// 创建按钮对象
        Button bu = new Button("用鼠标点击我,在命令行窗口有文字显示");
// bu.setSize(20, 10);
// 把按钮添加到窗体
        f.add(bu);
// 设置窗体可以关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你再次点击试试");
            }
        });
// 窗体显口
        f.setVisible(true);
    }
}