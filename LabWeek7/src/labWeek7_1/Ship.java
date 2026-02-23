/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labWeek7_1;

/**
 *
 * @author jeng
 */
public class Ship extends Vehicle implements Floatable{
    public Ship() {
        super();
    }
    public Ship(double fuel) {
        super(fuel);
    }
    public void move() {
        fl0at();
    }
    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            if (super.getFuel() < 50) {
                break;
            } fl0at();
        }
    }
    @Override
    public void fl0at() {
        if (super.getFuel() >= 50) {
            super.setFuel(super.getFuel() - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine() {
        if (super.getFuel() >= 10) {
            super.setFuel(super.getFuel() - 10);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
}
