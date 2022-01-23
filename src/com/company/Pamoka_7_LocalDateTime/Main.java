package com.company.Pamoka_7_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.minusHours(4).plusDays(119);//meniat i sohraniat v novij object

        String localDateTime3 = localDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd / hh:mm:ss")); //meniat i sohraniat Format  v novij String
        System.out.println(localDateTime3);

        ClassForExper labas = new ClassForExper(22000, 2000);
        System.out.println(labas.getMetas1() + " ir " + labas.getMetas2());
        System.out.println(labas.showWhichAreBigger());
    }







}
