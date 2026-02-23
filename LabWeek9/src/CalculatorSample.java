/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    private double num;
    private String op;
    private JPanel p;
    private JTextField txt;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton eq;
    private JButton plus;
    private JButton minus;
    private JButton multi;
    private JButton di;
    private JButton c;
    public CalculatorSample() {
        JFrame f = new JFrame();
        p = new JPanel();
        txt = new JTextField();
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        eq = new JButton("=");
        c = new JButton("c");
        plus = new JButton("+");
        minus = new JButton("-");
        multi = new JButton("x");
        di = new JButton("/");
        
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        eq.addActionListener(this);
        c.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multi.addActionListener(this);
        di.addActionListener(this);
        
        p.setLayout(new GridLayout(4, 4));
        p.add(seven); p.add(eight); p.add(nine); p.add(plus);
        p.add(four); p.add(five); p.add(six);
        p.add(minus); p.add(one); p.add(two); p.add(three);
        p.add(multi); p.add(zero); p.add(eq); p.add(c); p.add(di);
        
        f.setLayout(new BorderLayout());
        f.add(txt, BorderLayout.CENTER);
        f.add(p, BorderLayout.SOUTH);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String key = e.getActionCommand();
        if (key.equals("+") || key.equals("-") || key.equals("*") || key.equals("/")) {
            num = Double.parseDouble(txt.getText());
            op = key;
            txt.setText("");
        } else if (key.equals("c")) {
            num = 0;
            txt.setText("");
            op = "";
        } else if (key.equals("=")) {
            double num2 = Double.parseDouble(txt.getText());
            double result = 0;
            if (op.equals("+")) {
                result = num + num2;
            } else if (op.equals("-")) {
                result = num - num2;
            } else if (op.equals("*")) {
                result = num * num2;
            } else if (op.equals("/")) {
                result = num / num2;
            }
            txt.setText(String.valueOf(result));
        } else {
            txt.setText(txt.getText() + key);
        }
    }
}
