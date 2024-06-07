/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bosslady
 */
import java.util.Scanner;

public class InvestmentWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();

        double[] principalAmounts = new double[numberOfMembers];
        double[] interestRates = new double[numberOfMembers];
        int[] timePeriods = new int[numberOfMembers];
        double[] investmentValues = new double[numberOfMembers];

        // Input principal amounts, interest rates and time periods
        int i = 0;
        while (i < numberOfMembers) {
            System.out.print("Enter principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
            System.out.print("Enter annual interest rate (in %) for member " + (i + 1) + ": ");
            interestRates[i] = scanner.nextDouble();
            System.out.print("Enter time period in years for member " + (i + 1) + ": ");
            timePeriods[i] = scanner.nextInt();
            i++;
        }

        // Calculate investment values
        i = 0;
        while (i < numberOfMembers) {
            investmentValues[i] = principalAmounts[i] * Math.pow(1 + (interestRates[i] / 100), timePeriods[i]);
            i++;
        }

        // Display the results
        i = 0;
        while (i < numberOfMembers) {
            System.out.println("Investment value for member " + (i + 1) + ": " + investmentValues[i]);
            i++;
        }
    }
}
