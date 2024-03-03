package com.satyajit;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        while(n>0) {
            if(n%10 == 3) {
                count++;
            }
            n = n/10; // n /= 10;
        }
        System.out.println(count);
    }
}