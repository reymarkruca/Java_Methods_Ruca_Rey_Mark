/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_method;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Java_method {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        System.out.println(OddEven(1));
        System.out.println(classifyTriangle(5,5,5));
    }

    static int OddEven(int Number) {
        if (Number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || (long) side1 + side2 <= side3
                || (long) side1 + side3 <= side2
                || (long) side2 + side3 <= side1) {
            return 0;
        } else if (side1 == side2 && side2 == side3) {
            return 1;
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return 2;
        } else {
            return 3;
        }

    }
}