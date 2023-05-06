package com.coding;

import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        /*
        Scanner scanner= new scanner(system.in); =  is the statement that takes the input
        and will take input for each time no need to repeat
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double W = scanner.nextDouble();


        System.out.println("Enter the width of Rectangle:");
        double H = scanner.nextDouble();


        //Area = length*width;
        double area = W*H;
        System.out.println("the name of the user is: " + W);
        System.out.println("the name of the user is: " + H);
        System.out.println("Area of Rectangle is:" +area);

        //perimeter = 2(W+L);
        double perimeter = 2*(W+H);
        System.out.println("the name of the user is: " + W);
        System.out.println("the name of the user is: " + H);
        System.out.println("perimeter of Rectangle is:" +perimeter);


    }
}
