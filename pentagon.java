package com.coding;

import java.util.Scanner;
public class pentagon {
    public static void main(String[] args) {
        System.out.println("Enter the distance from centre: ");
        Scanner d = new Scanner(System.in);
        double r = d.nextDouble();
        // value of the pie
        double a = Math.PI;
        double i = Math.sin(a / 5);
        // formula of S
        double s = 2 * (r * (i));
        double k = Math.tan(a / 5);
        //formula of the area for pentagon
        double Area = 5 * (s * s) / (4 * k);
        double A = Math.ceil(Area);

        System.out.println("value of the S:"+ s);
        System.out.println("Area of the given pentagon is:"+ Area);
        System.out.println("Area of the given pentagon is: " + A);

    }
}
