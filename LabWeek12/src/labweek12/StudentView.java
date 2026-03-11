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
import java.io.*;
public class StudentView implements ActionListener {
    Student student;
    JTextField txt1;
    JTextField txt2;
    JTextField txt3;
    JButton btn1;
    JButton btn2;
    public StudentView() {
        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel label1 = new JLabel("ID:");
        JLabel label2 = new JLabel("Name:");
        JLabel label3 = new JLabel("Money:");
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField("100");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        
        txt3.setEditable(false);
        p1.setLayout(new GridLayout(3, 2));
        p1.add(label1); p1.add(txt1);
        p1.add(label2); p1.add(txt2);
        p1.add(label3); p1.add(txt3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        p2.setLayout(new GridLayout(1, 2));
        p2.add(btn1); p2.add(btn2);
        
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);
        
        readStudentView();
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveStudentView();
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int currentMoney = Integer.parseInt(txt3.getText());
        if (e.getSource() == btn1) {
            currentMoney += 100;
        } else {
            currentMoney -= 100;
        }
        txt3.setText(String.valueOf(currentMoney));
        student = new Student(txt2.getText(), Integer.parseInt(txt1.getText()), currentMoney);
    }
    
    public void readStudentView() {
        File file = new File("StudentView.dat");
        if (!file.exists()) {
            return;
        }
        try (FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);) {
            student = (Student) ois.readObject();
            if (student != null) {
                txt1.setText(String.valueOf(student.getID()));
                txt2.setText(student.getName());
                txt3.setText(String.valueOf(student.getMoney()));
            }
            System.out.println("Read");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void saveStudentView() {
        try (FileOutputStream fout = new FileOutputStream("StudentView.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            student = new Student(txt2.getText(), Integer.parseInt(txt1.getText()), Integer.parseInt(txt3.getText()));
            oos.writeObject(student);
            System.out.println("Write successful!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new StudentView();
    }
}
