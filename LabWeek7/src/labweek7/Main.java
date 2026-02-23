/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek7;

/**
 *
 * @author jeng
 */
public class Main {
public static void main(String[] args) {
Account a1 = new CheckingAccount();
a1.setName("Nook");
System.out.println(a1);
((CheckingAccount)a1).setCredit(1000);
System.out.println(a1);
}
}