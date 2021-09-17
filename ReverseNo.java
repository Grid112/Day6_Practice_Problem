package com.BridgeLabz;

import java.util.Scanner;

public class ReverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no Greater than 2 Digits : ");
        int N = sc.nextInt();

        int rev = 0;

        while (N != 0) {

            int digit = N % 10;
            rev = rev * 10 + digit;
            N /= 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}


