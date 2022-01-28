package com.company.homeWorks.savaite_3.paskaita_11.uzdotis_4_student;

public enum Universitet {
    HARVARD("Harvard University"),
    MIT("Massachusetts Institute of Technology"),
    STANFORD("Stanford University");

    private String fullName;

    Universitet(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
