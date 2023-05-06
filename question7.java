package com.coding;


import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        //principal value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of P:");
        double P = scanner.nextDouble();

        //time
        System.out.println("Enter the length of N:");
        double N = scanner.nextDouble();

        //no of rate
        System.out.println("Enter the length of R:");
        double R = scanner.nextDouble();

        //simple interest
        double si = (P*N*R)/100;
        System.out.println("simple interest is: "+si);




    }
}
