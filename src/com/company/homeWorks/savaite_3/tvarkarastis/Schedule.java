package com.company.homeWorks.savaite_3.tvarkarastis;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Schedule {

    private HashMap<Integer, Lecture> lectures = new HashMap<>();

    public void addNewLectureToSchedule(int unicNr, Lecture lecture) {
        lectures.put(unicNr, lecture);
    }

    //methods

    public void showShortInfoLecturesForNext2Weeks() {
        int i = 1;
        if (lectures.size() == 0) {
            System.out.println("Sarašas tusčias");
        } else {
            for (Map.Entry<Integer, Lecture> paskaita : this.lectures.entrySet()) {
                if (paskaita.getValue().getDateTimeOfStart().isBefore(LocalDateTime.now().plusWeeks(2))) {

                    System.out.printf("Nr: %d, su unicID: %d => ", i++, paskaita.getKey());
                    paskaita.getValue().shortInfoAboutLecture();
                }
            }
        }
    }

    public void loopForShowMoreInfoSubmenu_2() {
        int submenuInput = 0;

        do {
            printSubMenu("peržiureti");
            submenuInput = Main.checkScanerInputIsIntAndReturnInt();
            if (lectureNrIsBetween1and100(submenuInput) && lectures.get(submenuInput) != null) {
                lectures.get(submenuInput).infoAboutLecture();
            } else if (submenuInput == 101) {
                System.out.println("Back to main menu.");
            } else if (submenuInput == 102) {
                Main.scan.nextLine(); //eat next empty scan
                showShortInfoLecturesForOnlyTheme();
            } else {
                System.out.println("Klaida, tokios paskaitos nera");
            }
        } while (submenuInput != 101);
    }

    public void loopForRemoveLectureInSubmenu_3() {
        int submenuInput = 0;

        do {
            printSubMenu("ištrinti");
            submenuInput = Main.checkScanerInputIsIntAndReturnInt();
            if (lectureNrIsBetween1and100(submenuInput) && lectures.get(submenuInput) != null) {
                this.deleteLectureByUnicId(submenuInput);
            } else if (submenuInput == 101) {
                System.out.println("Back to main menu.");
            } else {
                System.out.println("Klaida, tokios paskaitos nera");
            }
        } while (submenuInput != 101);
    }

    public void loopForRewriteLectureInSubmenu_4() {
        int submenuInput = 0;

        do {
            printSubMenu("modifikuoti");
            submenuInput = Main.checkScanerInputIsIntAndReturnInt();
            if (lectureNrIsBetween1and100(submenuInput) && lectures.get(submenuInput) != null) {
                this.getInputsAndRewriteLecture(submenuInput);
            } else if (submenuInput == 101) {
                System.out.println("Back to main menu.");
            } else {
                System.out.println("Klaida, tokios paskaitos nera");
            }
        } while (submenuInput != 101);
    }

    private void showShortInfoLecturesForOnlyTheme() {
        int i = 1;
        if (lectures.size() == 0) {
            System.out.println("Sarašas tusčias");
        } else {
            System.out.println("Įveskite paskaitos tema, pagal kurie reikia rušioti:");
            String inputedFilter = Main.scan.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("Filtred sarašas pagal jusu filtras: " + inputedFilter + ": ");
            for (Map.Entry<Integer, Lecture> paskaita : this.lectures.entrySet()) {
                String enumValue = paskaita.getValue().getTheme().toString();
                if (inputedFilter.equals(enumValue)) {
                    System.out.printf("Nr: %d, su unicID: %d => ", i++, paskaita.getKey());
                    paskaita.getValue().shortInfoAboutLecture();
                }
            }
        }
    }

    private void getInputsAndRewriteLecture(int submenuInput) {
        System.out.println("Įveskite paskaitos: ");

        System.out.println("-> pavadinimą:");
        Main.scan.next(); //for eat next empty scan
        String title = Main.scan.nextLine();
        lectures.get(submenuInput).setTitle(title);

        System.out.println("-> aprašą:");
        String about = Main.scan.nextLine();
        lectures.get(submenuInput).setAbout(about);

        System.out.println("-> Datą ir laiką formatu - \"2021-01-01T12:50\":");
        LocalDateTime dateTimeIfStart = LocalDateTime.parse(Main.scan.nextLine());
        lectures.get(submenuInput).setDateTimeOfStart(dateTimeIfStart);

        System.out.println("-> Trukmę (val):");
        int duration = Main.checkScanerInputIsIntAndReturnInt();
        Main.scan.nextLine();
        lectures.get(submenuInput).setDuration(duration);

        System.out.println("-> temą:");
        LectureTheme theme = LectureTheme.valueOf(Main.scan.nextLine().toUpperCase(Locale.ROOT));
        lectures.get(submenuInput).setTheme(theme);

    }

    private static boolean lectureNrIsBetween1and100(int x) {
        return 1 <= x && x <= 100;
    }

    private void deleteLectureByUnicId(int numberForDelete) {
        lectures.remove(numberForDelete);
        System.out.println("Lecture Nr" + numberForDelete + " - įštrinta");
    }

    private void printSubMenu(String action) {
        System.out.println("---------------------------->>>>>----------------------------");
        System.out.println(action.toUpperCase(Locale.ROOT) + " atskira paskaita -  Įveskite paskaitos \"unicID\" iš sarašos viršuje. " +
                "arba, filtruoti pagal tema - įveskite 102. Grižti i pagrindine menu - įveskite 101.");
        System.out.println("---------------------------->>>>>----------------------------");
    }

}
