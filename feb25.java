package com.coding;

import javax.xml.transform.stax.StAXResult;
import java.util.Scanner;

public class feb25 {
    public static void main(String[] args) {
        // for status asking input
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 = for single status ");
        System.out.println("1 = for married filing jointly or qualified widow(er)");
        System.out.println("2 = for married filing separately.");
        System.out.println("enter you status accordingly: ");
        int status = scanner.nextInt();

        //for yearly salary asking input
        System.out.println("What is your annual income(in dollar)?: ");
        double income;
        income = scanner.nextDouble();
        double tax = 0 ;
        //case 0 = for single status
        switch (status) {
            case 0: {
                if (income <= 8350.0) {
                   tax  = (0.1 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 8352.0 && income <= 33950.0) {
                    tax =  (0.15 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 33951.0 && income <= 82250.0) {
                    tax = (0.25 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 82251.0 && income <= 171550.0) {
                    tax =  (0.28 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 171551.0) {
                   tax = (0.33 * income);
                    System.out.println("this is the tax: " + tax);

                }
            }
            break;

            case 1: {
                if (income <= 16700.0) {
                    tax = (0.1 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 16701.0 && income <= 67900.0) {
                    tax = (0.15 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 67901.0 && income <= 137050.0) {
                    tax= (0.25 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 137051.0 && income <= 208850.0) {
                   tax = (0.28 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 33951.0) {
                    tax = income - income * (0.33 * income);
                    System.out.println("this is the tax: " + tax);

                }

            }
            break;
            case 2: {
                if (income <= 8350.0) {
                    tax = (0.15 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 8352.0 && income <=33950.0) {
                    tax= (0.15 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 33951.0 && income <= 82250.0) {
                   tax = (0.25 * income);
                    System.out.println("this is the tax: " + tax);

                } else if (income >= 82251.0 && income <= 171550.0) {
                  tax =  (0.15 * income);
                  System.out.println("this is the tax: " + tax);

                } else if (income >= 171551.0) {
                    tax  =(0.15 * income);
                    System.out.println("this is the tax: " + tax);

                }

            }

            break;
        }

    }
}