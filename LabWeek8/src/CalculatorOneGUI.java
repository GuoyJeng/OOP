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
public class CalculatorOneGUI extends JFrame{
    private JPanel p;
    private JPanel p1;
    private JPanel p2;
    private JButton btn;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JTextField txt;
    private JTextField txt1;
    private JTextField txt2;
    public CalculatorOneGUI() {
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        btn = new JButton("บวก");
        btn1 = new JButton("ลบ");
        btn2 = new JButton("คูณ");
        btn3 = new JButton("หาร");
        txt = new JTextField();
        txt1 = new JTextField();
        txt2 = new JTextField();

        p.setLayout(new GridLayout(2, 1, 5, 5));
        p.add(txt);
        p.add(txt1);
        p1.add(btn); p1.add(btn1); p1.add(btn2); p1.add(btn3);
        p2.setLayout(new GridLayout(2, 1, 5, 5));
        p2.add(txt2);
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(txt2, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}

