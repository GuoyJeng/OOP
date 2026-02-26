/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jeng
 */
import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;
    public Customer() {
        firstName = "";
        lastName = "";
        acct = new ArrayList();
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + numOfAccount + " accounts.";
    }
    public Account getAccount(int index) {
        return acct.get(index);
    }
    public void addAccount(Account acct) {
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public int getNumOfAccount() {
        return numOfAccount;
    }
}
