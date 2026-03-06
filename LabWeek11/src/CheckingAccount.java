/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount() {
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if (a < 0) {
            super.withdraw(a);
        } else if (balance - a >= 0) {
            super.setBalance(super.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + super.getName() + " and your credit balance is " + credit + ".");
        } else if (balance - a < 0) {
            if (balance - a + credit >= 0) {
                double ans = a;
                a -= super.getBalance();
                credit -= a;
                super.setBalance(0);
                System.out.println(ans + " baht is withdrawn from " + super.getName() + " and your credit balance is " + credit + ".");
            } else {
                throw new WithdrawException(name + " has not enough money!");
            }
        }
    }
    public void withdraw(String a) throws WithdrawException{
        double num = Double.parseDouble(a);
        if (num < 0) {
            super.withdraw(num);
        } else if (balance - num >= 0) {
            super.setBalance(super.getBalance() - num);
            System.out.println(a + " baht is withdrawn from " + super.getName() + " and your credit balance is " + credit + ".");
        } else if (balance - num < 0) {
            if (balance - num + credit >= 0) {
                num -= super.getBalance();
                credit -= num;
                super.setBalance(0);
                System.out.println(a + " baht is withdrawn from " + super.getName() + " and your credit balance is " + credit + ".");
            } else {
                throw new WithdrawException(name + " has not enough money!");
            }
        }
    }
    @Override
    public String toString() {
        return "The " + super.getName() + " account has " + super.getBalance() + " baht and " + credit + " credits.";
    }
}
