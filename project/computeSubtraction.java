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
public class computeSubtraction {

    Scanner scanner = new Scanner(System.in);

    public static void computeSubtraction(Scanner scanner) {
        System.out.print("How many numbers for subtraction (2-4): ");
        int count = scanner.nextInt();
        scanner.nextLine();
        if (count == 2) { //for subtract between two numbers

            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.println("Result = " + subtraction(number1, number2));

        } else if (count == 3) {//for subtract between three numbers

            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();

            System.out.println("Result = " + subtraction(number1, number2, number3));

        } else if (count == 4) {//for subtract between four numbers

            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();

            System.out.print("Please enter the fourth number: ");
            int number4 = scanner.nextInt();

            System.out.println("Result = " + subtraction(number1, number2, number3, number4));
        } else {
            System.out.println("Invalid number! Please try again. ");
        }

    }

    public static int subtraction(int number1, int number2) { //method for subtract between two numbers
        return number1 - number2;
    }

    public static int subtraction(int number1, int number2, int number3) {//method for subtract between three numbers
        return number1 - number2 - number3;
    }

    public static int subtraction(int number1, int number2, int number3, int number4) {//method for subtract between four numbers
        return number1 - number2 - number3 - number4;
    }
    /*System.out.print("How many numbers for subtraction (2-4): ");
        int count = scanner.nextInt();
        
        if(count<2 || count>4){
            System.out.println("Invalid number count. Please check your number and try again!");
            return;
        }else{
        int result = 0;
        for(int i =1; i<=count; i++){
            System.out.println("Enter number "+i+": ");
            int number = scanner.nextInt();
            scanner.nextLine();
            
            if(i==1){
                result = number;
            }else{
                result-=number;
            }
        }
        System.out.println("Result= "+result);
    }
    }*/
}
