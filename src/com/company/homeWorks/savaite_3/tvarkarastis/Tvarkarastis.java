package com.company.homeWorks.savaite_3.tvarkarastis;

import java.util.HashMap;

public class Tvarkarastis {

    private HashMap<Integer, Paskaita> tvarkarastis = new HashMap<>();

    //SET and GET

    public HashMap<Integer, Paskaita> getTvarkarastis() {
        return tvarkarastis;
    }

    public void setTvarkarastis(HashMap<Integer, Paskaita> tvarkarastis) {
        this.tvarkarastis = tvarkarastis;
    }
}
