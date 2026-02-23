/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
public class Account {
    protected double balance;
    public Account (double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double a) {
        if (a > 0) {
            this.balance += a;
        } else {
            System.out.println("Input number must be positive integer.");
        }
    }
    public void withdraw(double a) {
        if (a > 0) {
            if (this.balance - a < 0) {
                System.out.println("Not enought money!");
            } else {
                this.balance -= a;
            }
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
}
