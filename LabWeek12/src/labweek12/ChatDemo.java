/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek12;

/**
 *
 * @author jeng
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

public class ChatDemo implements ActionListener{
    private final JTextArea txt;
    private final JTextField txtF;
    private final JButton btn1;
    private final JButton btn2;
    public ChatDemo(){
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        txt = new JTextArea(35, 20);
        txtF = new JTextField(45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        txt.setEditable(false);
        p.setLayout(new GridLayout(1, 1));
        p.add(txt);
        
        p2.setLayout(new GridLayout(1, 1));
        p2.add(txtF);
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(btn1); p1.add(btn2);

        frame.setLayout(new BorderLayout());
        frame.add(p, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.CENTER);
        frame.add(p1, BorderLayout.SOUTH);

        readChatDemo();
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveChatDemo();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = String.valueOf(txtF.getText());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        if (e.getSource() == btn1) {
            txt.append(dtf.format(LocalDateTime.now()) + " " + text + "\n");
        } else if (e.getSource() == btn2) {
            txt.setText("");
        }
        txtF.setText("");
    }
    
    public void saveChatDemo() {
        try (FileWriter fw = new FileWriter("ChatDemo.dat")) {
            fw.write(txt.getText());
            System.out.println("Write Successful!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void readChatDemo() {
        try (FileReader fr = new FileReader("ChatDemo.dat")) {
            int ch;
            StringBuilder sb = new StringBuilder();
            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }
            txt.append(sb.toString());
            fr.close();
            System.out.println("Read");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }
}
