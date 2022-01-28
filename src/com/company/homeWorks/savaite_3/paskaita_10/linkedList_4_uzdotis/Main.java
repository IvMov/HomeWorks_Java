package com.company.homeWorks.savaite_3.paskaita_10.linkedList_4_uzdotis;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listOfStrings = new LinkedList<>();

        System.out.println("-------1");
        listOfStrings.add("labas1");
        listOfStrings.add("labas2");
        listOfStrings.add("labas3");
        listOfStrings.add("labas4");
        listOfStrings.add("labas5");
        listOfStrings.add("labas6");
        System.out.println(listOfStrings);
        System.out.println("-------2");

        System.out.println(listOfStrings.getFirst());
        System.out.println(listOfStrings.getLast());
        System.out.println(listOfStrings.removeFirst());
        System.out.println(listOfStrings.removeLast());
        System.out.println("-------3");

        listOfStrings.push("labasAsGrizau1");
        System.out.println(listOfStrings);

        listOfStrings.pop();
        System.out.println(listOfStrings);
    }
}
