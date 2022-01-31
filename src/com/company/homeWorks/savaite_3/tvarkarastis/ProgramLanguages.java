package com.company.homeWorks.savaite_3.tvarkarastis;

public enum ProgramLanguages {
    JAVA("Java"),
    PYTHON("Python"),
    PHP("Php"),
    CSHARP("C#"),
    C("C"),
    CPLUSPLUS("C++");

    private String fullName;

    ProgramLanguages(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
