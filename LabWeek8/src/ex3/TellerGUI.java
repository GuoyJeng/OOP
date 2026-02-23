/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author jeng
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI extends JFrame{
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
        
        txt.setEditable(false);
        p.setLayout(new GridLayout(1, 2));
        p.add(lbl); p.add(txt);
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(lbl1); p1.add(txt1);
        
        p2.setLayout(new GridLayout(1, 3, 5, 5));
        p2.add(btn1); p2.add(btn2); p2.add(btn3);
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
