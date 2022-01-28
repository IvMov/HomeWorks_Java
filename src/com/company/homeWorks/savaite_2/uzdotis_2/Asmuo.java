package com.company.homeWorks.savaite_2.uzdotis_2;

import java.time.LocalDate;

public class Asmuo {

    private String vardas;
    private String pavarde;
    private LocalDate gimimoData;
    private String lytis;

    public Asmuo(String vardas, String pavarde, LocalDate gimimoData, String lytis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoData = gimimoData;
        this.lytis = lytis;
    }

    public LocalDate kadaSvestiKitaGimtadienis() { //grazino LocalDate
        return getNextGimtadienis();
    }

    public void printAboutAsmuo() { //neko ne grazino
        System.out.println("Labas " + vardas + " " + pavarde + ", tu sekmingai užregistuotas. Tu gime - " + gimimoData);
    }

    public int returnKiekBusMetuInThisYear(LocalDate yearInFuture) { //input Localdate - output - kiek metu
        int yearOfBirdthInt = gimimoData.getYear();
        int yearInFurureInt = yearInFuture.getYear();
        if (yearOfBirdthInt <= yearInFurureInt) {
            return yearInFurureInt - yearOfBirdthInt;
        }
        return 0;
    }

    private LocalDate getNextGimtadienis() {
        int nowYear = LocalDate.now().getYear();
        int gimimoYear = gimimoData.getYear();
        int nowYearsOld = nowYear - gimimoYear;

        return gimimoData.plusYears(nowYearsOld);
    }

    //get & set

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public LocalDate getGimimoData() {
        return gimimoData;
    }

    public void setGimimoData(LocalDate gimimoData) {
        this.gimimoData = gimimoData;
    }

    public String getLytis() {
        return lytis;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }
}
