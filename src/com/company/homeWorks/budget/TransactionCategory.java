package com.company.homeWorks.budget;

public enum TransactionCategory {
    MAISTA("mst"),
    ZAIDIMAI("zdm"),
    POILSIS(("pls")),
    KURAS("krs"),
    REMONTAS("rmt"),
    KITAS("kts");

    private String categoryTrumpinis;

    TransactionCategory(String categoryTrumpinis) {
        this.categoryTrumpinis = categoryTrumpinis;
    }

    public String getCategoryTrumpinis() {
        return categoryTrumpinis;
    }
}
