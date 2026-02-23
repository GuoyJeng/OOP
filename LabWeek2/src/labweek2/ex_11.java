/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek2;

/**
 *
 * @author jeng
 */
import java.util.*;
public class ex_11 {
    public static void main(String[] args) {
        double money;
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        money = input.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char type = input.next().charAt(0);
        if (type == 'A' | type == 'c') {
            money *= 1.015;
        } else if (type == 'B') {
            money *= 1.02;
        } else if (type == 'x') {
            money *= 1.05;
        } 
        System.out.println("Your total money in one year = " + money);
    }
}
