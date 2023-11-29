package com.hzp.homework6.test5;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FrameDemo
{
    public static void main(String[] args) {
        // 创建窗体对象
        Frame f = new Frame("关闭窗体例子程序");
        // 设置窗体属性
        f.setBounds(400, 200, 400, 300);
        // 让窗体关闭
        // 事件源
        // 事件：对窗体进行处理
        // 事件处理：关闭窗口(System.exit(0));
        // 事件监听
        // 用适配器类实现事件监听
        f.addWindowListener(new WindowAdapter( ) {
            @Override
            public void windowClosing( WindowEvent e ) {
                System.exit(0);
            }
        });
        // 设置窗体可见
        f.setVisible(true);
    }}