package com.coding;
import java.util.Scanner;
public class feb21ques2 {
    public static void main(String[] args) {
        int revenue, price, quantity;
        int discount = 0; // To hold discount
        //do you know what will happen if discount = 0 will be removed

        Scanner console = new Scanner(System.in);

        // Get value from the user.

        // Get value of price of product
        System.out.print("Enter price of product: ");
        price = console.nextInt();

        //get number of quantity of product
        System.out.print("Enter quantity of product: ");
        quantity = console.nextInt();


        // Calculate revenue.
        revenue = price * quantity;

        if (revenue > 5000)
        {
            // Calculate discount.
            discount = revenue * 10 / 100;
            // Calculate net revenue.
            revenue = revenue - discount;
        }
        else
        {
            System.out.println("no discount available ");
        }
        // Display Discount and net revenue.
        System.out.println("The discount is " + discount);
        System.out.println("The net revenue is " + revenue);

    }

}
