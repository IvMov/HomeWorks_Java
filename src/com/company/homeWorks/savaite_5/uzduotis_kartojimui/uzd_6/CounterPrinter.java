package com.company.homeWorks.savaite_5.uzduotis_kartojimui.uzd_6;

public class CounterPrinter extends Counter{

    public CounterPrinter(int i) {
        super(i);
    }

    @Override
    public void increment() {
        System.out.println(++i);
    }
}
