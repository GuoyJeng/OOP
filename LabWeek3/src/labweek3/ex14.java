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
public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "", cha, check = "";
        while (true) {
            System.out.print("Enter a character: ");
            cha = input.next();
            if (cha.equals("z")) {
                break;
            } else if (cha.equals("a") || cha.equals("e") || cha.equals("i") || cha.equals("o") || cha.equals("u")) {
                check += cha;
            } else if (cha.charAt(0) >= 'a' && cha.charAt(0) <= 'z') {
                ans += cha;
                check += cha;
            } else {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
        }
        System.out.println("\nAll characters entered: " + check);
        System.out.println("Consonants only: " + ans);
    }
}
