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
public class ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();
        System.out.print("Enter GPA: Enter family income: ");
        double income = input.nextDouble();
        if (gpa >= 3.5 && income <= 15000) {
            System.out.println("You are eligible for the scholarship.");
        } else {
            System.out.println("You are not eligible for a scholarship.");
        }
    }
}
