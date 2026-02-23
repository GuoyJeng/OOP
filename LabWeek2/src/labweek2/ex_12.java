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
public class ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = input.next();
        double weight, age, salary;
        int workingDay, absentDay;
        System.out.print("Please insert your age : ");
        age = input.nextDouble();
        System.out.print("Please insert number of working days : ");
        workingDay = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        absentDay = input.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = input.nextDouble();
        salary = 0;
        if (age >= 21 && age <= 30) {
            salary = workingDay * 300 - absentDay * 50;
        } else if (age >= 31 && age <= 40) {
            salary = workingDay * 500 - absentDay * 50;
        } else if (age >= 41 && age <= 50) {
            salary = workingDay * 1000 - absentDay * 25;
        } else if (age >= 51 && age <= 60) {
            salary = workingDay * 3000;
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " baht");
        if (weight >= 10 && weight <= 60) {
            salary += 5000;
        } else if (weight >= 61 && weight <= 90) {
            salary += 5000 - (weight - 60) * 10;
        }
        System.out.println("Your salary and bonus is " + salary + " baht");
    }
}
