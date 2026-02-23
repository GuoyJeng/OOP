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
public class TellerGUI implements ActionListener{
    private Account acc;
    private JPanel p;
    private JPanel p1;
    private JPanel p2;
    private JLabel lbl;
    private JLabel lbl1;
    private JTextField txt;
    private JTextField txt1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    public TellerGUI() {
        JFrame f = new JFrame();
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        lbl = new JLabel("Balance");
        lbl1 = new JLabel("Amount");
        txt = new JTextField("6000");
        txt1 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        txt.setEditable(false);
        p.setLayout(new GridLayout(1, 2));
        p.add(lbl); p.add(txt);
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(lbl1); p1.add(txt1);
        
        p2.setLayout(new GridLayout(1, 3, 5, 5));
        p2.add(btn1); p2.add(btn2); p2.add(btn3);
        
        f.setLayout(new BorderLayout());
        f.add(p, BorderLayout.NORTH);
        f.add(p1, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double num = Double.parseDouble(txt1.getText());
        if (e.getSource() == btn3) {
            System.exit(0);
        }
        if (e.getSource() == btn1) {
            acc.deposit(num);
            txt.setText(String.valueOf(acc.getBalance()));
        } else if (e.getSource() == btn2) {
            if (acc.getBalance() >= num) {
                acc.withdraw(num);
                txt.setText(String.valueOf(acc.getBalance()));
            }
        }
        txt1.setText("");
    }
}
