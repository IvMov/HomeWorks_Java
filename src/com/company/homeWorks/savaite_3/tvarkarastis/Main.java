package com.company.homeWorks.savaite_3.tvarkarastis;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean startProgram = true;
        HashMap<Integer, Paskaita> sausioMenTvarkarastis = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Paskaita testPaskaita1 = new Paskaita("Sav1Lect1", "about1",
                LocalDateTime.of(2021, 01, 01, 18, 00), 4, ProgramLanguages.CPLUSPLUS);
        Paskaita testPaskaita2 = new Paskaita("Sav1Lect2", "about2",
                LocalDateTime.of(2021, 01, 02, 18, 00), 4, ProgramLanguages.JAVA);
        Paskaita testPaskaita3 = new Paskaita("Sav1Lect3", "about3",
                LocalDateTime.of(2021, 01, 06, 18, 00), 4, ProgramLanguages.CSHARP);

        Paskaita testPaskaita4 = new Paskaita("Sav2Lect4", "about4",
                LocalDateTime.of(2021, 01, 07, 18, 00), 4, ProgramLanguages.CPLUSPLUS);
        Paskaita testPaskaita5 = new Paskaita("Sav2Lect5", "about5",
                LocalDateTime.of(2021, 01, 10, 18, 00), 2, ProgramLanguages.PHP);
        Paskaita testPaskaita6 = new Paskaita("Sav2Lect6", "about6",
                LocalDateTime.of(2021, 01, 10, 20, 00), 2, ProgramLanguages.PYTHON);


        sausioMenTvarkarastis.put(testPaskaita1.getUnicNrOfLecture(), testPaskaita1);
        sausioMenTvarkarastis.put(testPaskaita2.getUnicNrOfLecture(), testPaskaita2);
        sausioMenTvarkarastis.put(testPaskaita3.getUnicNrOfLecture(), testPaskaita3);
        sausioMenTvarkarastis.put(testPaskaita4.getUnicNrOfLecture(), testPaskaita4);
        sausioMenTvarkarastis.put(testPaskaita5.getUnicNrOfLecture(), testPaskaita5);
        sausioMenTvarkarastis.put(testPaskaita6.getUnicNrOfLecture(), testPaskaita6);

        while (startProgram) {
            System.out.println("1 - Įvesti naują paskaitą, 2 - Peržiūrėti tvarkaraštį, " +
                    "3 - Ištrinti įvestą paskaitą, 4 - Modifikuoti paskaitos įrašą 5 - Finish program");
            int inputCommand = sc.nextInt();

            if (inputCommand == 1) {
                System.out.println("1 => Iveskite: - paskaitos pavadinimą, - aprašą, - Datą ir laiką [2021-01-01T12:50], " +
                        "- Trukmę, - Tipą (JAVA, PYTHON, PHP, CSHARP, C, CPLUSPLUS) ");

                Paskaita newPaskaita = new Paskaita(sc.next(), sc.next(), LocalDateTime.parse(sc.next()), sc.nextInt(), ProgramLanguages.valueOf(sc.next()));
                sausioMenTvarkarastis.put(newPaskaita.getUnicNrOfLecture(), newPaskaita);

                System.out.println("Paskaita uzregistruota, turi unic ID:" + newPaskaita.getUnicNrOfLecture() + ", toliau, trumpa informacija apie programa =>");
                sausioMenTvarkarastis.get(newPaskaita.getUnicNrOfLecture()).infoAboutLecture();

            } else if (inputCommand == 2) {
                for (Map.Entry<Integer, Paskaita> paskaita : sausioMenTvarkarastis.entrySet()) {
                    System.out.printf("Nr: %d => ", paskaita.getKey());
                    paskaita.getValue().sortInfoAboutLecture();
                }
                System.out.println("Įveskite Nr paskaitos - peržiureti paskaita Nr: 1, 2, 3, 4....?");
                int inputUser = sc.nextInt();
                switch (inputUser) {
                    case 1:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 2:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 3:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 4:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 5:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 6:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 7:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 8:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 9:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 10:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 11:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    case 12:
                        sausioMenTvarkarastis.get(inputUser).infoAboutLecture();
                        break;
                    default:
                        System.out.println("Klaida");
                        break;
                }
            } else if (inputCommand == 3) {
                System.out.println("Įveskite Nr paskaitos - ištrinti paskaita Nr: 1, 2, 3, 4....?");
                int deleteNum = sc.nextInt();
                sausioMenTvarkarastis.remove(deleteNum);
            } else if (inputCommand == 4) {
                System.out.println("Įveskite Nr paskaitos - modifikuoti paskaita Nr: 1, 2, 3, 4....?");
                int changeNum = sc.nextInt();
                System.out.println("Dabar iveskite išnaujo visi parametrai: => Iveskite: - paskaitos pavadinimą, - aprašą, - Datą ir laiką [2021-01-01T12:50], " +
                        "- Trukmę, - Tipą (JAVA, PYTHON, PHP, CSHARP, C, CPLUSPLUS) ");
                sausioMenTvarkarastis.get(changeNum).setNameOfLecture(sc.next());
                sausioMenTvarkarastis.get(changeNum).setAboutLecture(sc.next());
                sausioMenTvarkarastis.get(changeNum).setTimeOfStartLecture(LocalDateTime.parse(sc.next()));
                sausioMenTvarkarastis.get(changeNum).setDurationOfLecture(sc.nextInt());
                sausioMenTvarkarastis.get(changeNum).setProgramLanguage(ProgramLanguages.valueOf(sc.next()));

            } else if (inputCommand == 5) {
                startProgram = false;
            }

        }
    }
}
