/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame implements ActionListener{
    JButton btn;
    JButton btn1;
    MyClock clock;
    public MyFrame() {
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        btn = new JButton("Pause");
        btn1 = new JButton("Resume");
        clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        
        btn.addActionListener(this);
        btn1.addActionListener(this);
        
        p.add(clock);
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(btn); p1.add(btn1);

        frame.add(p);
        frame.add(p1, BorderLayout.SOUTH);
        
        frame.setSize(200, 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            clock.pause();
        } else if (e.getSource() == btn1) {
            clock.resume();
        }
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
