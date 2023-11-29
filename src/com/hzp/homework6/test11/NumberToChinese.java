package com.hzp.homework6.test11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberToChinese extends JFrame implements ActionListener {
    private JTextField textField;
    private JLabel label;

    public NumberToChinese() {
        super("数字转中文");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        textField.addActionListener(this);
        add(textField);

        label = new JLabel();
        add(label);

        setSize(250,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String input = textField.getText();
        String[] digits = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] units = {"", "拾", "佰", "仟", "万", "亿"};

        StringBuilder result = new StringBuilder();
        int decimalIndex = input.indexOf(".");
        if (decimalIndex == -1) {
            decimalIndex = input.length();
        }
        int unitIndex = 0;
        for (int i = decimalIndex - 1; i >= 0; i--) {
            int digit = input.charAt(i) - '0';
            result.insert(0, digits[digit] + units[unitIndex % 4]);
            unitIndex++;
            if (unitIndex == 4) {
                result.insert(0, units[4]);
            } else if (unitIndex == 8) {
                result.insert(0, units[5]);
                unitIndex = 0;
            }
        }
        if (decimalIndex != input.length()) {
            result.append("点");
            for (int i = decimalIndex + 1; i < input.length(); i++) {
                int digit = input.charAt(i) - '0';
                result.append(digits[digit]);
            }
        }
        label.setText(result.toString());
    }

    public static void main(String[] args) {
        new NumberToChinese();
    }
}
