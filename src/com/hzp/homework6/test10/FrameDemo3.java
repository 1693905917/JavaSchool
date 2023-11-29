package com.hzp.homework6.test10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo3 {
    public static void main(String[] args) {
// 创建窗体对象
        Frame f = new Frame("将数据转移到另外一个控件");
// 设置窗体属性和布局
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());
// 创建文本框
        final TextField tf = new TextField(20);
// 创建按钮
        Button bu = new Button("数据转移");
// 创建文本区域
        final TextArea ta = new TextArea(10, 40);
// 把组件添加到窗体
        f.add(tf);
        f.add(bu);
        f.add(ta);
// 设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
// 对按钮添加事件
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// 获读取本框中的数据
                String tf_str = tf.getText().trim();
// 清空数据
                tf.setText("");
// 设置文本区域的内容
// ta.setText(tf_str);
// 文本区域中追加内容和换行
                ta.append(tf_str + "\r\n");
//获取光标
                tf.requestFocus();
            }
        });
// 设置窗体显示
        f.setVisible(true);
    }
}