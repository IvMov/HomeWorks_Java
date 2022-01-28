package com.company.homeWorks.savaite_3.paskaita_10.Koordinates;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Koordinate> arrayOfKoordinate = new ArrayList<>();

        arrayOfKoordinate.add(new Koordinate(1, 5));
        arrayOfKoordinate.add(new Koordinate(5, 5));
        arrayOfKoordinate.add(new Koordinate(4, 0));
        arrayOfKoordinate.add(new Koordinate(0, 0));
        arrayOfKoordinate.add(new Koordinate(9, 1));

        for (Koordinate elem : arrayOfKoordinate) {
            System.out.println("x:" + elem.getX() + ", y:" + elem.getY());
            if (elem.getX() == 0 && elem.getY() == 0) {
                elem.setX(1);
                elem.setY(1);
                System.out.println("Pakeičiau array");
            }
        }

        for (Koordinate elem : arrayOfKoordinate) {
            System.out.println("x:" + elem.getX() + ", y:" + elem.getY());
        }

    }

}
