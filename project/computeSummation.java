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
public class computeSummation {
    Scanner scanner = new Scanner(System.in);
    
    public static void computeSummation(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
      
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
       
        
        int summation = 0;
        for (int i = num1; i <= num2; i++) {
            summation += i;
        }
        
        System.out.println("Result = " + summation);
    }

}
