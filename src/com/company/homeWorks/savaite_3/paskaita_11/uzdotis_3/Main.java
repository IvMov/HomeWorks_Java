package com.company.homeWorks.savaite_3.paskaita_11.uzdotis_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashWithNumbers = new HashMap<>();
        HashMap<String, Integer> secondHashWithNumbers = new HashMap<>();

        hashWithNumbers.put(11, "vienuolika");
        hashWithNumbers.put(12, "dvylika");
        hashWithNumbers.put(100, "šimtas");
        System.out.println(hashWithNumbers);

        for (Map.Entry<Integer, String> pairKeyValue : hashWithNumbers.entrySet()) {
            secondHashWithNumbers.put(pairKeyValue.getValue(), pairKeyValue.getKey());
        }

        Main.printHashMap1(secondHashWithNumbers);
        Main.printHashMapIntString(hashWithNumbers);
        Main.printHashMapStringInt(secondHashWithNumbers);

        Main.printHashMapNesamones(secondHashWithNumbers);

        Main.printHashMapKeys(secondHashWithNumbers);

    }

    //Methods

    public static void printHashMap1(HashMap someHashMap) {
        System.out.println(someHashMap);
    }

    public static void printHashMapIntString(HashMap<Integer, String> someHashMap) {
        for (Map.Entry<Integer, String> pairKeyValue : someHashMap.entrySet()) {
            System.out.println(pairKeyValue.getKey() + " | " + pairKeyValue.getValue());
        }
    }

    public static void printHashMapStringInt(HashMap<String, Integer> someHashMap) {
        for (Map.Entry<String, Integer> pairKeyValue : someHashMap.entrySet()) {
            System.out.println(pairKeyValue.getKey() + " | " + pairKeyValue.getValue());
        }
    }

    public static void printHashMapNesamones(HashMap<String, Integer> someHashMap) {
        System.out.println("--------print nesamones -------");
        System.out.print("{");
        for (Map.Entry<String, Integer> pairKeyValue : someHashMap.entrySet()) {
            if (pairKeyValue.getValue() != 12) {
                System.out.print(pairKeyValue.getValue() + "=" + pairKeyValue.getKey() + ", ");
            } else {
                System.out.print(pairKeyValue.getValue() + "=" + pairKeyValue.getKey());
            }
        }
        System.out.print("}");
        System.out.println("");
        System.out.println("--------print nesamones -------");
    }

    public static void printHashMapKeys(HashMap<String, Integer> someHashMap) {
        for (Map.Entry<String, Integer> pairKeyValue : someHashMap.entrySet()) {
            System.out.println("Key is: " + pairKeyValue.getKey());
        }
    }
}
