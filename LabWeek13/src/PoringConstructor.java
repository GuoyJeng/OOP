/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor extends JFrame implements ActionListener{
    private int poringcount = 1;
    private final JButton b_add;
    public PoringConstructor(){
        b_add = new JButton("Add");
        b_add.addActionListener(this);
        add(b_add);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_add) {
            Poring poring = new Poring(poringcount);
            poringcount++;
        }
    }
}
