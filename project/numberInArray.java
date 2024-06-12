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
public class numberInArray {
    Scanner scanner = new Scanner(System.in);
    
     public static void numberInArray(Scanner scanner) {
        int[] array = {2, 4, 6, 8, 10};
        
        System.out.print("Please enter a number to search for it: ");
        int number = scanner.nextInt();
        
        boolean isInArray = false;
        for (int num : array) {
            if (num == number) {
                isInArray = true;
                break;
            }
        }
        
        if (isInArray) {
            System.out.println("This number is in our array. ");
        } else {
            System.out.println("This number is not in our array. ");
        }
    }
    
}