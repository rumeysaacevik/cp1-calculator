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
public class computeStandardDeviation {
    Scanner scanner = new Scanner(System.in);
    //standad deviation is the square root of the sum of the squares of the difference of the data values ​​from the arithmetic mean divided by one less than the data number.
     public static void computeStandardDeviation(Scanner scanner) {
        int[] numbers = new int[100]; //The number of terms in the array is determined.
        
        System.out.println("Please enter 100 numbers:");
        for (int i = 0; i < 100; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num; //for sum all the elements in the array
        }
        
        double mean = sum / 100; //for calculate the arithmetic mean, this is divided by the total number of terms.
        
        double sumSquaredDifferences = 0;
        for (int num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);//for calculate the sum of the squares divided by the number of data minus one
        }
        
        double variance = sumSquaredDifferences / 100;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Standard Deviation = " + standardDeviation);
     }
}

        

