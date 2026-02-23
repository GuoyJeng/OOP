/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlab;

/**
 *
 * @author jeng
 */
import java.util.*;
public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exercise time 1: ");
        int time1 = input.nextInt();
        System.out.print("Enter your exercise time 2: ");
        int time2 = input.nextInt();
        int cal = time1 + time2;
        int hour = cal / 3600;
        cal = cal % 3600;
        int minute = cal / 60;
        cal = cal % 60;
        System.out.println("It is " + hour + " hours " + minute + " minutes and " + cal + " seconds.");
    }

}
