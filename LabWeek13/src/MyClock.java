/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
import java.awt.Font;
//import java.util.Calendar;
import javax.swing.JLabel;
public class MyClock extends JLabel implements Runnable{
    private int checkTime;
    private boolean pause = false;
    private final Object lock = new Object();
    public void resume() {
        synchronized (lock) {
            pause = false;
            lock.notify(); // ปลุก Thread ให้ตื่นจากการ wait
        }
    }
    public void pause() {
        pause = true;
    }
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    while (pause) {
                        lock.wait(); // หยุดรอตรงนี้จนกว่าจะมีคนเรียก notify()
                    }
                }
//              Calendar d = Calendar.getInstance();
                if (!pause) {
                    int sec = checkTime % 60;
                    int min = (checkTime % 3600) / 60;
                    int hour = checkTime / 3600;
                    String time = String.format("%02d:%02d:%02d", hour, min, sec);
                    setText(time);
                    setFont(new Font("Serif", Font.BOLD, 18));
                    checkTime++;
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
