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
public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = input.nextInt(), exce, good, fair, poor;
        exce = 0;
        good = 0;
        fair = 0;
        poor = 0;
        for (int i = 1; i < num + 1; i++) {
            System.out.print("Enter score for student " + i + ": ");
            int score = input.nextInt();
            if (score >= 80) {
                System.out.println("Excellent");
                exce += 1;
            } else if (79 >= score && score >= 60) {
                System.out.println("Good");
                good += 1;
            } else if (59 >= score && score >= 50) {
                System.out.println("Fair");
                fair += 1;
            } else {
                System.out.println("Poor");
                poor += 1;
            }
        }
        System.out.println("\nSummary:");
        System.out.println("Excellent: " + exce);
        System.out.println("Good: " + good);
        System.out.println("Fair: " + fair);
        System.out.println("Poor: " + poor);
    }
}
