package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_2;

import java.util.Scanner;

public class MainToSleep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are now workday? please input \"True\" or \"False\"");
        Boolean workDay = Boolean.valueOf(sc.nextLine());
        System.out.println("Are you now in weekation? please input \"True\" or \"False\"");
        Boolean weekation = Boolean.valueOf(sc.nextLine());

        checkIfYouCanSleepNow(workDay, weekation);

        sc.close();
    }

    private static void checkIfYouCanSleepNow(Boolean workDay, Boolean weekation) {
        System.out.println((!workDay || weekation) ? "You can sleep!" : "Go back to work!");
    }
}
