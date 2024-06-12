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
public class computeFactorial {
    Scanner scanner = new Scanner(System.in);
    
    public static void computeFactorial(Scanner scanner) {
        System.out.print("Enter a number for factorial: ");
        int number = scanner.nextInt();
       
        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Result = " + factorial);
    }

}
