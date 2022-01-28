package com.company.homeWorks.savaite_3.paskaita_11.uzdotis_4_student;

public class Student {
    private static int studentNumber;

    private int studentID;
    private String name;
    private String surname;
    private Universitet university;

    public Student(String name, String surname, Universitet university) {
        studentNumber++;
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.studentID = studentNumber;
    }

    public void printAllInfo() {
        System.out.printf("Student Nr%d name is: %s, surname: %s, university full name: %s", studentID, name, surname, university.getFullName());
        System.out.println("");
    }


    //GET and SET


    public static int getStudentNumber() {
        return studentNumber;
    }

    public static void setStudentNumber(int studentNumber) {
        Student.studentNumber = studentNumber;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Universitet getUniversity() {
        return university;
    }

    public void setUniversity(Universitet university) {
        this.university = university;
    }
}
