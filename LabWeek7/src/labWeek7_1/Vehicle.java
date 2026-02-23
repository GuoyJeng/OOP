/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labWeek7_1;

/**
 *
 * @author jeng
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public double getFuel() {
        return fuel;
    }
    public Vehicle() {
        fuel = 0;
    }
    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    public void addFuel(double fuel) {
        this.fuel += fuel;
    }
    public abstract void honk();
}
