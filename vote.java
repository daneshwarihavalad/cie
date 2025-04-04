package cie;

import java.util.Scanner; 

public class vote {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an age:");
        n = input.nextInt(); 

        if (n < 18) {
            System.out.println("not eligible for voting");
            System.out.println("age is eligible");
        } else { 
            System.out.println("eligible for voting");
        }
        input.close(); 
    }
}