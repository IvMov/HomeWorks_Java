package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_3;

import java.util.ArrayList;

public class MainArmstrongNumbers {

    public static void main(String[] args) {
        printArmstrongArray();
    }

    private static void printArmstrongArray() {
        ArrayList<Integer> inputNumbersFrom100to999 = getArrayfrom100to999();
        ArrayList<Integer> outputArmstrongNumbers = new ArrayList<>();

        for (int num : inputNumbersFrom100to999) {
            String stringNum = String.valueOf(num);

            int firstNum = Integer.parseInt(String.valueOf(stringNum.charAt(0)));
            int secondNum = Integer.parseInt(String.valueOf(stringNum.charAt(1)));
            int thirdNum = Integer.parseInt(String.valueOf(stringNum.charAt(2)));

            if ((cubeOf(firstNum) + cubeOf(secondNum) + cubeOf(thirdNum)) == num) {
                outputArmstrongNumbers.add(num);
            }
        }
        System.out.println("Armstrong numbers from 100 to 999: " + outputArmstrongNumbers);
    }


    private static ArrayList getArrayfrom100to999() {
        ArrayList allXXXNumbers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            allXXXNumbers.add(i);
        }
        return allXXXNumbers;
    }

    private static int cubeOf(int a) {
        return a * a * a;
    }
}
