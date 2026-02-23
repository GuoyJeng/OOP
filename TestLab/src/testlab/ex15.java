/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlab;

/**
 *
 * @author jeng
 */
import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        double stamp = money / 50;
        int stamps = (int) stamp;
        System.out.println("Total Price : " + money);
        System.out.println("You got " + stamps + " stamp (s)");
    }
}
