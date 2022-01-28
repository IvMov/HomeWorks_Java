package com.company.homeWorks.budget;

import java.math.BigDecimal;

public class Budzetas {

    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private BigDecimal budgetSuma = BigDecimal.valueOf(18000.23);


//   ----------------------- ISLAIDOS methods-------------------------

    public void pridetiIslaiduIrasa(BigDecimal islaidoSuma, CategoryOfCost islaidoCategorija, AtsiskaitymoBudas islaidoAtsiskaitymoBuda, Korteles islaidoKortele) {
        IslaiduIrasas islaida = new IslaiduIrasas(islaidoSuma, islaidoCategorija, islaidoAtsiskaitymoBuda, islaidoKortele);
        islaidos[IslaiduIrasas.getIslaidoNr() - 1] = islaida;
        budgetSuma.subtract(islaidoSuma);
        System.out.println(String.format(
                "Islaida Nr%d suformota. Suma: %E, category: %s, time of operation: %s, atsiskaitimo buda: %s, kortele: %s. Saskaitoje: %.2f EUR",
                islaida.getIslaidoNr(), islaidoSuma, islaidoCategorija, islaida.dateTimeToString(), islaidoAtsiskaitymoBuda, islaidoKortele, budgetSuma));
    }

    public void gautiIslaiduIrasa(int IslaidoNr) {
        System.out.println(String.format(
                "INFO ABOUT Islaida Nr%d: Suma: %E, category: %s, time of operation: %s, atsiskaitimo buda: %s, kortele: %s.",
                islaidos[IslaidoNr - 1].getIslaidoNrNotStatic(), islaidos[IslaidoNr - 1].getIslaidoSuma(), islaidos[IslaidoNr - 1].getIslaidoCategorija(),
                islaidos[IslaidoNr - 1].dateTimeToString(), islaidos[IslaidoNr - 1].getIslaidoAtsiskaitymoBuda(), islaidos[IslaidoNr - 1].getIslaidoKortele()));
    }

    //   ----------------------- PAJAMOS methods-------------------------

    public void pridetiPajamuIrasa(BigDecimal pajamosSuma, CategoryOfCost pajamosCategorija, boolean pajamaGauta, String pajamosKomentarus) {
        PajamuIrasas pajamas = new PajamuIrasas(pajamosSuma, pajamosCategorija, pajamaGauta, pajamosKomentarus);
        pajamos[PajamuIrasas.getPajamoNr() - 1] = pajamas;
        budgetSuma.add(pajamosSuma);
        System.out.println(String.format(
                "Pajama Nr%d suformota %s. Suma: %E, category: %s, pajama %s, komentarus: %s. Saskaitoje: %.2f EUR",
                PajamuIrasas.getPajamoNr(), pajamas.getStringData(), pajamas.getPajamosSuma(), pajamas.getPajamosCategorija(),
                pajamas.getTeksApiePajamoGavimas().toUpperCase(), pajamas.getPajamosKomentarus(), budgetSuma));
    }

    public void gautiPajamuIrasa(int PajamasNr) {
        System.out.println(String.format(
                "INFO ABOUT pajama Nr%d, data - %s: Suma: %E, category: %s, pajama %s, komentarus: %s",
                pajamos[PajamasNr - 1].getPajamoNrNotStatic(), pajamos[PajamasNr - 1].getStringData(), pajamos[PajamasNr - 1].getPajamosSuma(), pajamos[PajamasNr - 1].getPajamosCategorija(),
                pajamos[PajamasNr - 1].getTeksApiePajamoGavimas().toUpperCase(), pajamos[PajamasNr - 1].getPajamosKomentarus()));
    }

    public void getSaskaitoLikutis() {
        System.out.printf("Saskaitoje: %.2f EUR", budgetSuma);
        ;
    }

    //GET SET METHODS

    public PajamuIrasas[] getPajamos() {
        return pajamos;
    }

    public IslaiduIrasas[] getIslaidos() {
        return islaidos;
    }

    public BigDecimal getBudgetSuma() {
        return budgetSuma;
    }
}
