package com.company.homeWorks.savaite_3.tvarkarastis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lecture {

    private static int nr;
    private final int UNIC_NR;
    private String title;
    private String about;
    private LocalDateTime dateTimeOfStart;
    private int duration;
    private LectureTheme theme;

    public Lecture(String title, String about, LocalDateTime dateTimeOfStart,
                   int duration, LectureTheme theme) {
        this.UNIC_NR = ++nr;
        this.title = title;
        this.about = about;
        this.dateTimeOfStart = dateTimeOfStart;
        this.duration = duration;
        this.theme = theme;
    }

    //methods

    public static Lecture getInputAndCreateNewLecture() {
        System.out.println("Įveskite paskaitos: ");

        System.out.println("-> pavadinimą:");
        Main.scan.next(); //for eat next empty scan
        String title = Main.scan.nextLine();

        System.out.println("-> aprašą:");
        String about = Main.scan.nextLine();

        System.out.println("-> Datą ir laiką formatu - \"2021-01-01T12:50\":");
        LocalDateTime dateTimeIfStart = LocalDateTime.parse(Main.scan.nextLine());

        System.out.println("-> Trukmę (val):");
        int duration = Main.checkScanerInputIsIntAndReturnInt();
        Main.scan.nextLine();

        System.out.println("-> temą:");
        LectureTheme theme = LectureTheme.valueOf(Main.scan.nextLine().toUpperCase(Locale.ROOT));


        Lecture newLecture = new Lecture(title, about, dateTimeIfStart, duration, theme);

        System.out.println("Paskaita uzregistruota, turi unic ID:" + newLecture.getUNIC_NR() +
                ", trumpa informacija apie suurta paskaita:");
        newLecture.shortInfoAboutLecture();

        return newLecture;
    }

    public void shortInfoAboutLecture() {
        System.out.printf("-- %s :: tema -  %s \n", dateAndTimeToString(), theme.getFullName(), duration, title, about);
    }

    public void infoAboutLecture() {
        System.out.println(">>>>>>>-------->>>>>>>");
        System.out.printf("%s, %s, trukmė: %dh, Paskaita: %s, apie: %s. \n",
                dateAndTimeToString(),
                theme.getFullName(),
                duration,
                title,
                about);
        System.out.println(">>>>>>>-------->>>>>>>");
    }

    private String dateAndTimeToString() {
        return dateTimeOfStart.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm"));
    }

    //SET and GET

    public int getUNIC_NR() {
        return UNIC_NR;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public LocalDateTime getDateTimeOfStart() {
        return dateTimeOfStart;
    }

    public void setDateTimeOfStart(LocalDateTime dateTimeOfStart) {
        this.dateTimeOfStart = dateTimeOfStart;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LectureTheme getTheme() {
        return theme;
    }

    public void setTheme(LectureTheme theme) {
        this.theme = theme;
    }

}
