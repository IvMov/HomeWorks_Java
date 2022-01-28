package com.company.homeWorks.budget;

public enum CategoryOfCost {
    MAISTA("mst"),
    ZAIDIMAI("zdm"),
    POILSIS(("pls")),
    KURAS("krs"),
    REMONTAS("rmt"),
    KITAS("kts");

    private String categoryTrumpinis;

    CategoryOfCost(String categoryTrumpinis) {
        this.categoryTrumpinis = categoryTrumpinis;
    }

    public String getCategoryTrumpinis() {
        return categoryTrumpinis;
    }
}
