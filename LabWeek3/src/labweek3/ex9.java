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
public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String ans = input.next();
            if (ans.equals("PASS2025")) {
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
