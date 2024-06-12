/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Scanner;
import static project.computeFactorial.computeFactorial;
import static project.computeProduct.computeProduct;
import static project.computeDivision.computeDivision;
import static project.computeStandardDeviation.computeStandardDeviation;
import static project.computeSubtraction.computeSubtraction;
import static project.computeSum.computeSum;
import static project.computeSummation.computeSummation;
import static project.numberInArray.numberInArray;
import static project.sumArrays.sumArrays;
import static project.testPrime.testPrime;

public class Test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println("-------- Hello --------");
        System.out.println("=======================");

        int choice;
        do {
            displayMenu();
            System.out.print("What do you want to do? (Enter the number of the operation (0-10)): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    computeSum(scanner);
                    break;
                case 2:
                    computeSubtraction(scanner);
                    break;
                case 3:
                    computeProduct(scanner);
                    break;
                case 4:
                    computeDivision(scanner);
                    break;
                case 5:
                    computeFactorial(scanner);
                    break;
                case 6:
                    computeSummation(scanner);
                    break;
                case 7:
                    sumArrays(scanner);
                    break;
                case 8:
                    testPrime(scanner);
                    break;
                case 9:
                    numberInArray(scanner);
                    break;
                case 10:
                    computeStandardDeviation(scanner);
                    break;
                case 0:
                    System.out.println("=========================");
                    System.out.println("--------- Thanks --------");
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Compute Sum");
        System.out.println("2. Compute Subtraction");
        System.out.println("3. Compute Product");
        System.out.println("4. Compute Division");
        System.out.println("5. Compute Factorial");
        System.out.println("6. Compute Summation");
        System.out.println("7. Sum Arrays");
        System.out.println("8. Test Prime");
        System.out.println("9. Check Number in Array");
        System.out.println("10. Compute Standard Deviation");
        System.out.println("0. Exit");
    }
}
