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
public class ex_10 {
    public static void main(String[] args) {
        double money;
        Scanner input = new Scanner(System.in);
        money = input.nextDouble();
        if (money > 50000.00) {
            money *= 0.1;
        } else {
            money *= 0.05;
        }
        System.out.println(money);
    }
}
