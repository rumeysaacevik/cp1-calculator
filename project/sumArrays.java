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

public class sumArrays {
    Scanner scanner = new Scanner(System.in);
    public static void sumArrays(Scanner scanner) {
        System.out.print("Enter the length of the arrays: ");
        int length = scanner.nextInt();
        
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        
        int[] sumArray = new int[length];
        for (int i = 0; i < length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        
        System.out.print("Result:");
        for (int i = 0; i < length; i++) {
            System.out.println("Sum of elements " + (i + 1) + ": " + sumArray[i]);
        }
    }
    

}
