/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6;

/**
 *
 * @author jeng
 */
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        }
    }
    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        } else if (slot == 2) {
            book2 = null;
        } else if (slot == 3) {
            book3 = null;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName + "\n");
        if (book1 != null) {
            book1.printDetails();
        } 
        System.out.println("");
        if (book2 != null) {
            book2.printDetails();
        } 
        System.out.println("");
        if (book3 != null) {
            book3.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void checkBookAvailability(int slot) {
        if (slot == 1 && book1 != null) {
            System.out.println(book1.title + " is available.");
        } else if (slot == 2 && book2 != null) {
            System.out.println(book2.title + " is available.");
        } else if (slot == 3 && book3 != null) {
            System.out.println(book3.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1 && book1 != null) {
            book1.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + book1.price + ".");
        } else if (slot == 2 && book2 != null) {
            book2.price = newPrice;
            System.out.println("Updated price of " + book2.title + " to $" + book2.price + ".");
        } else if (slot == 3 && book3 != null) {
            book3.price = newPrice;
            System.out.println("Updated price of " + book3.title + " to $" + book3.price + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
