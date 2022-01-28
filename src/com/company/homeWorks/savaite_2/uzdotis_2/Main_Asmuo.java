package com.company.homeWorks.savaite_2.uzdotis_2;

import java.time.LocalDate;

public class Main_Asmuo {
    public static void main(String[] args) {

        Asmuo nameIvasik = new Asmuo("Ivan", "Movchanets", LocalDate.parse("1991-05-20"), "male");
        Asmuo nameIvashka = new Asmuo("Ivashka", "Movch", LocalDate.parse("2019-11-17"), "male");

        nameIvasik.printAboutAsmuo();
        System.out.println(nameIvasik.kadaSvestiKitaGimtadienis());

        System.out.println("---------- Another Asmuo --------");

        nameIvashka.printAboutAsmuo();
        System.out.println(nameIvashka.kadaSvestiKitaGimtadienis());



    }
}
