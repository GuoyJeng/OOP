/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jeng
 */
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    private int numOfAccount;
    public Customer() {
        firstName = "";
        lastName = "";
        acct = null;
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = null;
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + numOfAccount + " accounts.";
    }
    public Account getAcct() {
        return acct;
    }
}
