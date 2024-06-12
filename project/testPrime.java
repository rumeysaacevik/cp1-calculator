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
public class testPrime {
    Scanner scanner = new Scanner(System.in);
    public static void testPrime(Scanner scanner) {
        
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }

}
