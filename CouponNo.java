package com.BridgeLabz;

import java.util.Scanner;

public class CouponNo {

    public static int getCoupon(int no) {
        int random = (int) (Math.random() * no);
        return random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coupons you want : ");
        int no = sc.nextInt();
        boolean[] isCollected = new boolean[no];
        int count = 0;
        int distinct = 0;

        while (distinct < no) {
            System.out.println("Random : " + getCoupon(no));
            int value = getCoupon(no);
            count++;
            if (isCollected[value] == false) {
                distinct++;
                isCollected[value] = true;
            }
        }
        System.out.println(count);
        System.out.println(" Random function is called : " + count + " times");
        System.out.println("For generating " + no + " Distinct coupons.");
    }
}


