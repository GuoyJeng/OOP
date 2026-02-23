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
public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max, min, check, num;
        num = 0;
        max = 0;
        min = 0;
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            check = input.nextInt();
            if (check == -1) {
                break;
            }
            if (num == 0) {
                max = check;
                min = check;
            }
            if (max < check) {
                max = check;
            }
            if (min > check) {
                min = check;
            }
            num += 1;
        }
        System.out.println("Maximun = " + max);
        System.out.println("Minimum = " + min);
    }
}
