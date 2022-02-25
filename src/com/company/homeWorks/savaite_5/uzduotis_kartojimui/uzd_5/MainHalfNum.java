package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_5;

public class MainHalfNum {

    public static void main(String[] args) {
        int[] testArray = {2, 34, 65, 70};
        System.out.println(getSummOfEveryElementHalf(testArray));
    }

    private static double getSummOfEveryElementHalf(int[] intArray) {
        double summ = 0;

        for (int elem : intArray) {
            summ += (double) elem / 2;
        }
        return summ;
    }
}
