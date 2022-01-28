package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas {

    private static int islaidoNr;

    private int islaidoNrNotStatic;
    private BigDecimal islaidoSuma;
    private CategoryOfCost islaidoCategorija;
    private LocalDateTime islaidoOperacijosDataIrLaikas;
    private AtsiskaitymoBudas islaidoAtsiskaitymoBuda;
    private Korteles islaidoKortele;

    public IslaiduIrasas(BigDecimal islaidoSuma, CategoryOfCost islaidoCategorija, AtsiskaitymoBudas islaidoAtsiskaitymoBuda, Korteles islaidoKortele) {
        islaidoNr++;
        this.setIslaidoNrNotStatic(islaidoNr);
        this.islaidoSuma = islaidoSuma;
        this.islaidoCategorija = islaidoCategorija;
        this.islaidoOperacijosDataIrLaikas = LocalDateTime.now();
        this.islaidoAtsiskaitymoBuda = islaidoAtsiskaitymoBuda;
        this.islaidoKortele = islaidoKortele;
    }

    public String dateTimeToString() {
        return islaidoOperacijosDataIrLaikas.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    //GET and SET METHODS


    public static int getIslaidoNr() {
        return islaidoNr;
    }

    public static void setIslaidoNr(int islaidoNr) {
        IslaiduIrasas.islaidoNr = islaidoNr;
    }

    public int getIslaidoNrNotStatic() {
        return islaidoNrNotStatic;
    }

    public void setIslaidoNrNotStatic(int islaidoNrNotStatic) {
        this.islaidoNrNotStatic = islaidoNrNotStatic;
    }

    public BigDecimal getIslaidoSuma() {
        return islaidoSuma;
    }

    public void setIslaidoSuma(BigDecimal islaidoSuma) {
        this.islaidoSuma = islaidoSuma;
    }

    public CategoryOfCost getIslaidoCategorija() {
        return islaidoCategorija;
    }

    public void setIslaidoCategorija(CategoryOfCost islaidoCategorija) {
        this.islaidoCategorija = islaidoCategorija;
    }

    public LocalDateTime getIslaidoOperacijosDataIrLaikas() {
        return islaidoOperacijosDataIrLaikas;
    }

    public void setIslaidoOperacijosDataIrLaikas(LocalDateTime islaidoOperacijosDataIrLaikas) {
        this.islaidoOperacijosDataIrLaikas = islaidoOperacijosDataIrLaikas;
    }

    public AtsiskaitymoBudas getIslaidoAtsiskaitymoBuda() {
        return islaidoAtsiskaitymoBuda;
    }

    public void setIslaidoAtsiskaitymoBuda(AtsiskaitymoBudas islaidoAtsiskaitymoBuda) {
        this.islaidoAtsiskaitymoBuda = islaidoAtsiskaitymoBuda;
    }

    public Korteles getIslaidoKortele() {
        return islaidoKortele;
    }

    public void setIslaidoKortele(Korteles islaidoKortele) {
        this.islaidoKortele = islaidoKortele;
    }
}
