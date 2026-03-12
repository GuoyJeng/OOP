/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring extends JFrame{
    private int poringnum;
        public Poring(){
        this(0);
    }
    public Poring(int num){
        this.poringnum = num;
        
        ImageIcon poringimg = new ImageIcon(getClass().getResource("/Images/poring.png"));
        Image poringimgscale = poringimg.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        JLabel poring = new JLabel(new ImageIcon(poringimgscale));
        JLabel number = new JLabel(this.poringnum+"");
        JPanel container = new JPanel(new FlowLayout());
        
        poring.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                dispose();
            }
        });
        container.add(poring);
        container.add(number);
        add(container);
//        frame.pack();
        setSize(300,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
}
