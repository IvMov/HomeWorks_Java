package com.company.homeWorks.budget;

import java.math.BigDecimal;

public class Programa {
    public static void main(String[] args) {

        Budzetas myFirstDudget = new Budzetas();

        myFirstDudget.pridetiIslaiduIrasa(BigDecimal.valueOf(200.55), CategoryOfCost.POILSIS, AtsiskaitymoBudas.KORTELE, Korteles.KORTELE1);
        myFirstDudget.pridetiIslaiduIrasa(BigDecimal.valueOf(50.21), CategoryOfCost.ZAIDIMAI, AtsiskaitymoBudas.KORTELE, Korteles.KORTELE2);
        myFirstDudget.pridetiIslaiduIrasa(BigDecimal.valueOf(12.22), CategoryOfCost.MAISTA, AtsiskaitymoBudas.KORTELE, Korteles.KORTELE3);

        System.out.println("-------------------------------------------------------------------------------------");

        myFirstDudget.pridetiPajamuIrasa(BigDecimal.valueOf(1000.23), CategoryOfCost.KITAS, true, "Algos pervedimas");
        myFirstDudget.pridetiPajamuIrasa(BigDecimal.valueOf(1300.55), CategoryOfCost.KITAS, true, "Algos pervedimas");
        myFirstDudget.pridetiPajamuIrasa(BigDecimal.valueOf(212.43), CategoryOfCost.KITAS, false, "Algos pervedimas, uz papildomi funkcijos");
        myFirstDudget.pridetiPajamuIrasa(BigDecimal.valueOf(5000.43), CategoryOfCost.KITAS, true, "Premija už 2021m");

        System.out.println("-------------------------------------------------------------------------------------");

        myFirstDudget.gautiIslaiduIrasa(2);
        myFirstDudget.gautiPajamuIrasa(3);

        myFirstDudget.getSaskaitoLikutis();

    }
}
