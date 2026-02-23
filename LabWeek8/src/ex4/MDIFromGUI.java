/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author jeng
 */
import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    public MDIFromGUI() {
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Applitcation 01", true, true, true, true);
        frame2 = new JInternalFrame("Applitcation 02", true, true, true, true);
        frame3 = new JInternalFrame("Applitcation 03", true, true, true, true);
        
        this.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        m1.add(ms1); m1.add(mi1); m1.addSeparator();
        m1.add(mi2); m1.addSeparator(); 
        m1.add(mi3);
        ms1.add(msi1); ms1.addSeparator();
        ms1.add(msi2);
        
        frame1.getContentPane();
        frame1.pack();
        frame1.setVisible(true);
        
        frame2.getContentPane();
        frame2.pack();
        frame2.setVisible(true);
        
        frame3.getContentPane();
        frame3.pack();
        frame3.setVisible(true);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        int x2 = frame1.getX() + frame1.getWidth() + 10;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        
        int x3 = frame2.getX() + frame2.getWidth() + 10;
        int y3 = frame2.getY();
        frame3.setLocation(x3, y3);
        
        desktopPane.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());
        this.add(desktopPane, BorderLayout.CENTER);
        this.setSize(new Dimension(300, 300));
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
    }
}
