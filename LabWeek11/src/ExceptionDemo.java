/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeng
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Double a = Double.parseDouble(args[0]);
            Double b = Double.parseDouble(args[1]);
            Double c = Double.parseDouble(args[2]);
            Double ans = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            Double ans1 = (-1 * b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            System.out.println(ans);
            System.out.println(ans1);
        } catch (NumberFormatException e){
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
