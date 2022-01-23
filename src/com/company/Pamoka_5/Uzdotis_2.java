package com.company.Pamoka_5;

public class Uzdotis_2 {
    public static void main(String[] args) {
        spausdink("Ivan", "Movchanets", "Java", 20);
        spausdink("Ivan", "Movchanets", "Java");
    }
    public static void spausdink(String vardas, String pavarde, String kalba, int savaiciuSkaicius) {
        System.out.println("Aš " + vardas + " " + pavarde + ", tikrai išmoksiu programuoti " + kalba + " kalba per " + savaiciuSkaicius + " savaites.");
    }
    public static void spausdink(String vardas, String pavarde, String kalba) {
        System.out.println("Aš " + vardas + " " + pavarde + ", tikrai išmoksiu programuoti " + kalba + " kalba.");
    }
}
