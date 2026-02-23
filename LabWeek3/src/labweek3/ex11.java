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
public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int num = input.nextInt(), total, paid;
        total = 0;
        for (int i = 1; i < num + 1; i++) {
            System.out.print("Enter price for item " + i + ": ");
            int item = input.nextInt();
            total += item;
        }
        System.out.println("Total = " + total);
        System.out.print("\nEnter amount paid: ");
        paid = input.nextInt();
        System.out.println("Change = " + (paid - total));
    }
}
