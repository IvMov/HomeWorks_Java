package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_4;

import java.util.Scanner;

public class MainMixString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here is test result: " + mixStrings("Labas", "Vakaras") + "\n ----------------------------");

        System.out.println("Please input some word and press Enter=> ");
        String string1 = sc.nextLine();
        System.out.println("Please input some another word and press Enter=> ");
        String string2 = sc.nextLine();
        System.out.println("Here is your result - mix from your words: " + mixStrings(string1, string2));

        sc.close();
    }

    private static String mixStrings(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 999; i++) {
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
            if (i > word1.length() && i > word2.length()) {
                break;
            }
        }
        return String.valueOf(stringBuilder);
    }
}
