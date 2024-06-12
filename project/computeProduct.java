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
public class computeProduct {
    Scanner scanner = new Scanner (System.in);
    
    public static void computeProduct(Scanner scanner){
        System.out.print("Please enter the first number: ");
        float number1= scanner.nextFloat();
        
        System.out.print("Please enter the second number: ");
        float number2 = scanner.nextFloat();
        
        float product = number1*number2;
        System.out.println("Result= "+multiply(number1, number2));
        
    }public static int multiply(int number1, int number2) {//method to calculate the product of two given numbers
        return number1 * number2;
    }

    public static float multiply(float number1, float number2) {//method to calculate the product of two given numbers
        return number1 * number2;
    }
    
}
