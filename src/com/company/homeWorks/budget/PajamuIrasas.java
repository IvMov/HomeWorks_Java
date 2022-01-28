package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PajamuIrasas {
    private static int pajamoNr;

    private int pajamoNrNotStatic;
    private BigDecimal pajamosSuma;
    private CategoryOfCost pajamosCategorija;
    private LocalDate pajamoOperacijosData;
    private boolean pajamaGauta;
    private String pajamosKomentarus;

    public PajamuIrasas(BigDecimal pajamosSuma, CategoryOfCost pajamosCategorija, boolean pajamaGauta, String pajamosKomentarus) {
        pajamoNr++;
        this.pajamoNrNotStatic = pajamoNr;
        this.pajamosSuma = pajamosSuma;
        this.pajamosCategorija = pajamosCategorija;
        this.pajamoOperacijosData = LocalDate.now();
        this.pajamaGauta = pajamaGauta;
        this.pajamosKomentarus = pajamosKomentarus;
    }

    public String getStringData() {
        return pajamoOperacijosData.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getTeksApiePajamoGavimas() {
        return this.pajamaGauta ? "gauta" : "ne gauta";
    }

    //GET and SET methods


    public static int getPajamoNr() {
        return pajamoNr;
    }

    public static void setPajamoNr(int pajamoNr) {
        PajamuIrasas.pajamoNr = pajamoNr;
    }

    public int getPajamoNrNotStatic() {
        return pajamoNrNotStatic;
    }

    public void setPajamoNrNotStatic(int pajamoNrNotStatic) {
        this.pajamoNrNotStatic = pajamoNrNotStatic;
    }

    public BigDecimal getPajamosSuma() {
        return pajamosSuma;
    }

    public void setPajamosSuma(BigDecimal pajamosSuma) {
        this.pajamosSuma = pajamosSuma;
    }

    public CategoryOfCost getPajamosCategorija() {
        return pajamosCategorija;
    }

    public void setPajamosCategorija(CategoryOfCost pajamosCategorija) {
        this.pajamosCategorija = pajamosCategorija;
    }

    public LocalDate getPajamoOperacijosData() {
        return pajamoOperacijosData;
    }

    public void setPajamoOperacijosData(LocalDate pajamoOperacijosData) {
        this.pajamoOperacijosData = pajamoOperacijosData;
    }

    public boolean isPajamaGauta() {
        return pajamaGauta;
    }

    public void setPajamaGauta(boolean pajamaGauta) {
        this.pajamaGauta = pajamaGauta;
    }

    public String getPajamosKomentarus() {
        return pajamosKomentarus;
    }

    public void setPajamosKomentarus(String pajamosKomentarus) {
        this.pajamosKomentarus = pajamosKomentarus;
    }
}
