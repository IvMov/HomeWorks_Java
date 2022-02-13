package com.company.homeWorks.budget;

public enum PaymentMethods {
    GRYNAIS("Grynais"),
    KORTELE("Kortele"),
    BANKOMATAS("Išeimo iš bankomato"),
    PERVEDIMAS("Pervedimas į kita banko saskaita"),
    KITAS("Kitas neizvestnij metod");

    private String pilnasPavadinimas;

    PaymentMethods(String pilnasPavadinimas) {
        this.pilnasPavadinimas = pilnasPavadinimas;
    }

    public String getPilnasPavadinimas() {
        return pilnasPavadinimas;
    }
}
