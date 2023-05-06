 package com.coding;
//gourav anand
//21BEC0354
import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char whattodo;
        do {
            System.out.println("welcome to my calculator🥰");
            System.out.println("performing addition enter 1");
            System.out.println("performing subtract enter 2");
            System.out.println("performing division enter 3");
            System.out.println("performing multiplication enter 4");

            //you want to perform input
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number you want to perform on number: ");
            int choice  = sc.nextInt();

            while( choice != 1 & choice != 2 & choice != 3 & choice != 4){
                System.out.println("error the input number "+ choice + " is not defined try again" );
                System. exit(1);
                break;
            }


            //input of number 1
            System.out.println("enter the number 1: ");
            int num1 = sc.nextInt();

            //input of number 2
            System.out.println("enter the number 2: ");
            int num2 = sc.nextInt();


            //condition for calculation
            //addition
            while(choice == 1){
                float addition = num1 + num2;
                System.out.println("addition of "+ num1 + " and " + num2);
                System.out.println("addition result = " + addition);
                break;
            }
            //subtraction
            while(choice == 2){
                float subtraction = num1 - num2;
                System.out.println("subtraction of "+ num1 + " and " + num2);
                System.out.println("addition result = " + subtraction);
                break;

            }
            //multiplication
            while(choice == 3){
                float multiplication = num1 * num2;
                System.out.println("multiplication of "+ num1 + " and " + num2);
                System.out.println("addition result = " + multiplication);
                break;

            }
            //division
            while(choice == 4){
                float division = num1/num2;
                System.out.println("division  of "+ num1 + " and " + num2);
                System.out.println("addition result = " + division);
                break;
            }
            System.out.println("Do You Want To Continue(Y/N)");
            whattodo = sc.next().charAt(0);

        } while(whattodo == 'Y'|| whattodo == 'y');

        while(whattodo == 'N' || whattodo == 'n'){
            System.out.println("see you again and thank for using me !!");
            System. exit(1);
            break;
        }
    }
}

