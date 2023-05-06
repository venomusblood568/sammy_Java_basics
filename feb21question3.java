package com.coding;
import java.util.Scanner;

public class feb21question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

    if (BMI < 18.5)
        System.out.println(" you are in underweight ");
    if (18.5 <= BMI  &&  BMI < 25.0)
        System.out.println(" you are in normal ");
    if (25.0 <= BMI && BMI < 30.0)
        System.out.println(" you are in overweight ");
    if (30.0 <= BMI)
        System.out.println(" you are in obese");
    }
}