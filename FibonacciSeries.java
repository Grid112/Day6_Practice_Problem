package com.BridgeLabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a No:" );
        int N = Sc.nextInt();

        //Initialization
        int a = 0;
        int b = 1;
        int c = 0;

        //Computation Using For Loop
        for(int i=1; i<=N; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
