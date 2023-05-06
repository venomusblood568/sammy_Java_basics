package com.coding;
import java.util.Scanner;
public class table_advaned{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for taking the number as input from the user
        System.out.println("enter the number you want : ");
        int number = sc.nextInt();

        // for taking the range as input for the user
        System.out.println("enter the range you want : ");
        int range =  sc.nextInt();

        int i = 1;
        while (i <= range){
            System.out.println(number + " * " + i +" = " + number*i);
            i ++;

        }
    }
}
