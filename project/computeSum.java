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

public class computeSum {

    Scanner scanner = new Scanner(System.in);

    public static void computeSum(Scanner scanner) {
        System.out.print("How many numbers for summation (2-4): ");
        int count = scanner.nextInt();
        
        if (count == 2) { //for calculate the sum of two numbers
            
            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();
            
            System.out.println("Result = "+adding(number1, number2));
            
        } else if (count == 3) { //for calculate the sum of three numbers
            
            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();
            
            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();
            
            System.out.println("Result = "+adding(number1, number2, number3));
            
        } else if (count == 4) { //for calculate the sum of four numbers
            
            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();
            
            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();
            
            System.out.print("Please enter the fourth number: ");
            int number4 = scanner.nextInt();
            
            
            System.out.println("Result = "+adding(number1, number2, number3, number4));
            
        }else{
            System.out.println("Invalid number! Please try again. ");
        }

    }

    public static int adding(int number1, int number2) {//method for calculate the sum of two numbers
        return number1 + number2;
    }

    public static int adding(int number1, int number2, int number3) {//method for calculate the sum of three numbers
        return number1 + number2 + number3;
    }

    public static int adding(int number1, int number2, int number3, int number4) { //method for calculate the sum of four numbers
        return number1 + number2 + number3 + number4;
    }
}
