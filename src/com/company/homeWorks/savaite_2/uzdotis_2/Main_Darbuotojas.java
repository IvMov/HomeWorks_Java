package com.company.homeWorks.savaite_2.uzdotis_2;

public class Main_Darbuotojas {
    public static void main(String[] args) {
        Darbuotojas workerWithoutName1 = new Darbuotojas(1000.5, 160);
        Darbuotojas workerWithoutName2 = new Darbuotojas(400.5, 120);

        Darbuotojas workerWithName1 = new Darbuotojas("Ivan", 200, 132.5);
        Darbuotojas workerWithName2 = new Darbuotojas("Stepan", 6000, 122.5);

        workerWithName1.getAllInformation();
        workerWithName2.getAllInformation();
        workerWithoutName1.getAllInformation();
        workerWithoutName2.getAllInformation();

        workerWithName1.addMoreAtlyginimas();
        workerWithName2.addMoreAtlyginimas();
        workerWithoutName1.addMoreAtlyginimas();
        workerWithoutName2.addMoreAtlyginimas();

        System.out.println("------------------- have add some atliginimas-------------------------");

        workerWithName1.getAllInformation();
        workerWithName2.getAllInformation();
        workerWithoutName1.getAllInformation();
        workerWithoutName2.getAllInformation();

        workerWithName1.addMoreWork(100.5);
        System.out.println(workerWithName1.getAtlyginimas());
        workerWithName1.getAllInformation();
    }
}
