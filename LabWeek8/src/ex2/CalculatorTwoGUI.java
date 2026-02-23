/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author jeng
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI extends JFrame{
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
    public CalculatorTwoGUI() {
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
        
        p.setLayout(new GridLayout(4, 4));
        p.add(seven); p.add(eight); p.add(nine); p.add(plus);
        p.add(four); p.add(five); p.add(six);
        p.add(minus); p.add(one); p.add(two); p.add(three);
        p.add(multi); p.add(zero); p.add(eq); p.add(c); p.add(di);
        
        setLayout(new BorderLayout());
        add(txt, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
