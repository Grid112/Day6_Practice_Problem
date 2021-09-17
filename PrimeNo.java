package com.BridgeLabz;

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int N = sc.nextInt();
        int flag = 0;
        if (N == 1) {
            flag = 1;
        } else if (N == 2) {
            flag = 1;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0)
                    flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");

    }
}


