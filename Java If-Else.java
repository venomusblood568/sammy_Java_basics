//task//
//
Given an integer, n, perform the following conditional actions:

- If n is odd, print Weird
- If n is even and in the inclusive range of 2 to 5, print Not Weird
- If m is even and in the inclusive range of 6 to 20, print Weird
- If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n. is weird.
//
import java.io.*;
import java.math.*;

import java.text.*;
import java.util.*;

import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String output= "";
        if (n%2 == 1){
            output = "Weird";
            
        }
        else {
            if (n >= 2 && n <= 5){
                output = "Not Weird";
                
            }
            else if (n >= 6 && n <= 20)
            {
                output = "Weird";
            }
            else{
                output = "Not Weird";
            }
        }
        System.out.println(output);
    }
}
