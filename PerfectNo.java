package com.BridgeLabz;

import java.util.Scanner;

public class PerfectNo {

    public static void main(String[] args) {
        int sum = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a no:");// No to check If its PerfectNo or No
        int N = Sc.nextInt();
        int i = 1;
        while (i <= N / 2) {
            if (N % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == N) {
            System.out.println(N + " is a perfect number");
        } else
            System.out.println(N + " is not a  perfect number");
    }
}


