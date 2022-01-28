package com.company.homeWorks.savaite_3.paskaita_11.uzdotis_4_student;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean doProgram = true;
        HashMap<Integer, Student> listOfStudents = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (doProgram) {
            System.out.println("Pres − [1] – įvesti studentą");
            if (listOfStudents.size() != 0) {
                System.out.println("Pres - [2] – gauti studentą pagal numerį");
            }
            System.out.println("Pres - [3] – baigti programą");

            int inputNumber = sc.nextInt();

            if (inputNumber == 1) {
                System.out.println("Įveskite vardą and press Enter / Įveskite pavardę and press Enter / Įveskite universitetą and press Enter;");
                Student someStudent = new Student(sc.next(), sc.next(), Universitet.valueOf(sc.next()));
                listOfStudents.put(someStudent.getStudentID(), someStudent);
            } else if (inputNumber == 2) {
                System.out.println("Įveskite studento numeris:");
                int stNum = sc.nextInt();
                System.out.println(stNum);
                listOfStudents.get(stNum).printAllInfo();
            } else if (inputNumber == 3) {
                doProgram = false;
                System.out.println("Program closed.");
            }
        }
        sc.close();
    }
}
