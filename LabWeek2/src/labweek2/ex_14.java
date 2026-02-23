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
public class ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tempurature( ํc): ");
        double tem = input.nextDouble();
        System.out.print("Enter humidity (%) : ");
        double humi = input.nextDouble();
        
        if (tem > 37.5) {
            System.out.println("\nWarning: High tempurature!");
        } else {
            System.out.println("\nTempurature normal.");
        }
        
        if (humi > 80) {
            System.out.println("Humidity is too high.");
        } else {
            System.out.println("Humidity is acceptable.");
        }
    }
}
