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
public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int num = input.nextInt();
        String ans = "";
        for (int i = 1; i < num + 1; i++) {
            System.out.print("Enter digit " + i + ": ");
            String digit = input.next();
            ans += digit;
        }
        System.out.println("Final Code = " + ans);
    }
}
