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
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0, even = 0;
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
