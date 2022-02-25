package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input 2 integers which > 0, after each one press Enter =>");
        printPrimeNumbersInIntervalAtoB(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

        sc.close();
    }

    private static void printPrimeNumbersInIntervalAtoB(int a, int b) {
        int divideInZero = 0;
        ArrayList primeNumbers = new ArrayList<>();

        for (int i = a; i < b; i++) {
            divideInZero = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divideInZero++;
                }
            }
            if (divideInZero <= 2) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Prime numbers from this interval [" + a + ":" + b + "]: " + primeNumbers);
    }
}
