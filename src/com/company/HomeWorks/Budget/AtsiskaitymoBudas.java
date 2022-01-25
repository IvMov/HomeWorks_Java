package com.company.HomeWorks.Budget;

public enum AtsiskaitymoBudas {
    GRYNAIS("Grynais"),
    KORTELE("Kortele"),
    BANKOMATAS("Išeimo iš bankomato"),
    PERVEDIMAS("Pervedimas į kita banko saskaita"),
    KITAS("Kitas neizvestnij metod");

    private String pilnasPavadinimas;

    AtsiskaitymoBudas(String pilnasPavadinimas) {
        this.pilnasPavadinimas = pilnasPavadinimas;
    }

    public String getPilnasPavadinimas() {
        return pilnasPavadinimas;
    }
}
