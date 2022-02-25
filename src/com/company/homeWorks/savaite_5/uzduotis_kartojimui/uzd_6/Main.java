package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_6;

public class Main {

    public static void main(String[] args) {
        Counter counter = new CounterPrinter(1);

        counter.increment();
        counter.increment();
        counter.increment();


        System.out.println("--------------------------------------------------");

        Counter counter2 = new Counter(1);
        counter2.increment();
        counter2.increment();
        counter2.increment();
        System.out.println("After 3 itterations: " + counter2.getI());

    }
}
