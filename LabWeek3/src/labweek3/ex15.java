/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek3;

/**
 *
 * @author jeng
 */
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, amount = 0, money;
        while (amount <= 1000) {
            System.out.print("Enter deposit amount: ");
            money = input.nextInt();
            amount += money;
            num += 1;
        }
        System.out.println("\nTarget reached!");
        System.out.println("Total amount saved = " + amount);
        System.out.println("Number of deposits = " + num);
    }
}
