package com.company.homeWorks.savaite_3.tvarkarastis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paskaita {

    private static int nrOfLecture;
    private int unicNrOfLecture;
    private String nameOfLecture;
    private String aboutLecture;
    private LocalDateTime timeOfStartLecture;
    private int durationOfLecture;
    private ProgramLanguages programLanguage;

    public Paskaita(String nameOfLecture, String aboutLecture, LocalDateTime timeOfStartLecture,
                    int durationOfLecture, ProgramLanguages programLanguage) {
        this.unicNrOfLecture = ++nrOfLecture;
        this.nameOfLecture = nameOfLecture;
        this.aboutLecture = aboutLecture;
        this.timeOfStartLecture = timeOfStartLecture;
        this.durationOfLecture = durationOfLecture;
        this.programLanguage = programLanguage;
    }

    public void sortInfoAboutLecture() {
        System.out.printf("%s : , %s", dateAndTimeToString(), programLanguage.getFullName(), durationOfLecture, nameOfLecture, aboutLecture);
        System.out.println("");
    }

    public void infoAboutLecture() {
        System.out.printf("%s, %s, trukmė: %dh, Paskaita: %s, apie: %s.", dateAndTimeToString(), programLanguage.getFullName(), durationOfLecture, nameOfLecture, aboutLecture);
        System.out.println("");
    }

    private String dateAndTimeToString() {
        return timeOfStartLecture.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm"));
    }

    //SET and GET

    public static int getNrOfLecture() {
        return nrOfLecture;
    }

    public static void setNrOfLecture(int nrOfLecture) {
        Paskaita.nrOfLecture = nrOfLecture;
    }

    public int getUnicNrOfLecture() {
        return unicNrOfLecture;
    }

    public void setUnicNrOfLecture(int unicNrOfLecture) {
        this.unicNrOfLecture = unicNrOfLecture;
    }

    public String getNameOfLecture() {
        return nameOfLecture;
    }

    public void setNameOfLecture(String nameOfLecture) {
        this.nameOfLecture = nameOfLecture;
    }

    public String getAboutLecture() {
        return aboutLecture;
    }

    public void setAboutLecture(String aboutLecture) {
        this.aboutLecture = aboutLecture;
    }

    public LocalDateTime getTimeOfStartLecture() {
        return timeOfStartLecture;
    }

    public void setTimeOfStartLecture(LocalDateTime timeOfStartLecture) {
        this.timeOfStartLecture = timeOfStartLecture;
    }

    public int getDurationOfLecture() {
        return durationOfLecture;
    }

    public void setDurationOfLecture(int durationOfLecture) {
        this.durationOfLecture = durationOfLecture;
    }

    public ProgramLanguages getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(ProgramLanguages programLanguage) {
        this.programLanguage = programLanguage;
    }

}
