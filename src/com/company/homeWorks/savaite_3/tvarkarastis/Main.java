package com.company.homeWorks.savaite_3.tvarkarastis;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int mainMenuInput = 0;
        Schedule allLectures = new Schedule();

        Main.createTestLectures(allLectures);

        do {
            printMainMenuControlInfo();
            mainMenuInput = checkScanerInputIsIntAndReturnInt();

            switch (mainMenuInput) {
                case 1 -> {
                    Lecture newLecture = Lecture.getInputAndCreateNewLecture();
                    allLectures.addNewLectureToSchedule(newLecture.getUNIC_NR(), newLecture);
                }
                case 2 -> {
                    allLectures.showShortInfoLecturesForNext2Weeks();
                    allLectures.loopForShowMoreInfoSubmenu_2();
                }
                case 3 -> {
                    allLectures.showShortInfoLecturesForNext2Weeks();
                    allLectures.loopForRemoveLectureInSubmenu_3();
                }
                case 4 -> {
                    allLectures.showShortInfoLecturesForNext2Weeks();
                    allLectures.loopForRewriteLectureInSubmenu_4();
                }
                case 101 -> {
                    System.out.println("Programa pabaigta...");
                }
                default -> {
                    System.out.println("Įveskite kitas scaičius");
                }
            }

        } while (mainMenuInput != 101);

        allLectures.showShortInfoLecturesForNext2Weeks();

        scan.close();
    }

    private static void createTestLectures(Schedule lectures) {
        Lecture testLecture1 = new Lecture("Sav1Lect1", "about1",
                LocalDateTime.of(2022, 02, 02, 18, 00), 4, LectureTheme.CPP);
        Lecture testLecture2 = new Lecture("Sav1Lect2", "about2",
                LocalDateTime.of(2022, 02, 02, 18, 00), 4, LectureTheme.JAVA);
        Lecture testLecture3 = new Lecture("Sav1Lect3", "about3",
                LocalDateTime.of(2022, 02, 26, 18, 00), 4, LectureTheme.CSHARP);

        Lecture testLecture4 = new Lecture("Sav2Lect4", "about4",
                LocalDateTime.of(2022, 02, 07, 18, 00), 4, LectureTheme.CPP);
        Lecture testLecture5 = new Lecture("Sav2Lect5", "about5",
                LocalDateTime.of(2022, 02, 10, 18, 00), 2, LectureTheme.PHP);
        Lecture testLecture6 = new Lecture("Sav2Lect6", "about6",
                LocalDateTime.of(2022, 02, 10, 20, 00), 2, LectureTheme.PYTHON);
        Lecture testLecture7 = new Lecture("Sav2Lect7", "about7",
                LocalDateTime.of(2022, 02, 13, 13, 20), 2, LectureTheme.C);


        lectures.addNewLectureToSchedule(testLecture1.getUNIC_NR(), testLecture1);
        lectures.addNewLectureToSchedule(testLecture2.getUNIC_NR(), testLecture2);
        lectures.addNewLectureToSchedule(testLecture3.getUNIC_NR(), testLecture3);
        lectures.addNewLectureToSchedule(testLecture4.getUNIC_NR(), testLecture4);
        lectures.addNewLectureToSchedule(testLecture5.getUNIC_NR(), testLecture5);
        lectures.addNewLectureToSchedule(testLecture6.getUNIC_NR(), testLecture6);
        lectures.addNewLectureToSchedule(testLecture7.getUNIC_NR(), testLecture7);
    }

    private static void printMainMenuControlInfo() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Įveskite: 1 -> Įvesti naują paskaitą, " +
                "2 -> Peržiūrėti tvarkaraštį, " +
                "3 -> Ištrinti įvestą paskaitą, " +
                "4 -> Modifikuoti paskaitos įrašą " +
                "101 -> Baigti program.");
        System.out.println("--------------------------------------------------------------------------");
    }

    static int checkScanerInputIsIntAndReturnInt() {
        int inputCommand = 0;
        do {
            if (scan.hasNextInt()) {
                inputCommand = scan.nextInt();
            } else {
                scan.next();
                System.out.println("Įveskite scaičius, ne raide.");
            }
        } while (inputCommand == 0);
        return inputCommand;
    }

}
