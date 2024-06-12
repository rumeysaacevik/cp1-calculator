/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Rümeysa
 */
public class computeDivision {

    Scanner scanner = new Scanner(System.in);

    public static void computeDivision(Scanner scanner) {
        System.out.print("Please enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Please enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Division by zero!");
            System.out.println("=======================");
            return;
        }

        double quotient = divide(dividend, divisor);

        System.out.println("Result = " + divide(dividend, divisor));
        System.out.println("=======================");
    }

  
    public static void computeDivisionFloat(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        float dividend = scanner.nextFloat();

        System.out.print("Enter the divisor: ");
        float divisor = scanner.nextFloat();

        if (divisor == 0) {
            System.out.println("Error: Division by zero!");
            System.out.println("=======================");
            return;
        }

        float quotient = divide(dividend, divisor);

        System.out.println("Result = " + divide(dividend, divisor));
        System.out.println("=======================");
    }

    
    public static double divide(int dividend, int divisor) {
        return (double) dividend / divisor;
    }

    
    public static float divide(float dividend, float divisor) {
        return dividend / divisor;
    }
    
}
