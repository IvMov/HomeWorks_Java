package com.company.Pamoka_5;

import java.util.Scanner;

public class Uzdotis_3 {
    public static void main(String[] args) {
        double d1 = m1();
        double d2 = m2();
        System.out.println("d1 + d2 = " + (d1 + d2));
    }
    public static double m1 () {
        double m1Variable = 123.5;
        return m1Variable;
    }
    public static double m2 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite new double: ");
        double m2Variable = sc.nextDouble();
        sc.close();
        return m2Variable;

    }

}
