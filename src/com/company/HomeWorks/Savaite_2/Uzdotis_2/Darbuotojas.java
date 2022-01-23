package com.company.HomeWorks.Savaite_2.Uzdotis_2;

public class Darbuotojas {
    private String darbuotojoName;
    private double atlyginimas;
    private double summWorkHours;

    public Darbuotojas(double atlyginimas, double summWorkHours) {
        this.atlyginimas = atlyginimas;
        this.summWorkHours = summWorkHours;
    }

    public Darbuotojas(String darbuotojoName, double atlyginimas, double summWorkHours) {
        this(atlyginimas, summWorkHours);
        this.darbuotojoName = darbuotojoName;
    }

    public void getAllInformation() {
        if (darbuotojoName != null) {
            System.out.println("Worker " + darbuotojoName + " get atlyginimas - " + atlyginimas + "EUR, for " + summWorkHours + " hours of work.");
        } else {
            System.out.println("Worker get atlyginimas - " + atlyginimas + "EUR, for " + summWorkHours + " hours of work.");
        }
    }

    public double addMoreAtlyginimas() {
        if (atlyginimas <= 500) {
            System.out.println("have add some money for this worker");
            return atlyginimas = atlyginimas + 10;

        } else {
            return atlyginimas;
        }
    }

    public void addMoreWork(double hoursToAdd) {
        atlyginimas = atlyginimas + (5 * hoursToAdd);
        summWorkHours = summWorkHours + hoursToAdd;

    }

    //-----SET and GET

    public String getDarbuotojoName() {
        return darbuotojoName;
    }

    public void setDarbuotojoName(String darbuotojoName) {
        this.darbuotojoName = darbuotojoName;
    }

    public double getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public double getSummWorkHours() {
        return summWorkHours;
    }

    public void setSummWorkHours(double summWorkHours) {
        this.summWorkHours = summWorkHours;
    }
}
