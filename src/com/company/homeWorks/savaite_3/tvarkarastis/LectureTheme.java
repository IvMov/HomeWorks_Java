package com.company.homeWorks.savaite_3.tvarkarastis;

public enum LectureTheme {
    JAVA("Java"),
    PYTHON("Python"),
    PHP("Php"),
    CSHARP("C#"),
    C("C"),
    CPP("C++");

    private String fullName;

    LectureTheme(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
