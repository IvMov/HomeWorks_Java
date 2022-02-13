package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        String inputComand;

        Budget myFirstDudget = new Budget();
        Scanner sc = new Scanner(System.in);

        setTestInfoToBudget(myFirstDudget);

        do {
            printMainMenu();
            inputComand = sc.nextLine();

            switch (inputComand) {
                case "b" -> {
                    myFirstDudget.getInfoBudgetBalance();
                }
                case "pc" -> {
                    myFirstDudget.printAllCosts();
                }
                case "pi" -> {
                    myFirstDudget.printAllIncomes();
                }
                case "dc" -> {
                    myFirstDudget.printAllCosts();
                    System.out.println("Įveskite išlaido Nr, kurie norite ištrinti:");
                    int numForDelete = Integer.parseInt(sc.nextLine());
                    myFirstDudget.getCosts().remove(numForDelete - 1);
                    System.out.printf("Išlaida Nr %d ištrinta!\n", numForDelete);
                }
                case "di" -> {
                    myFirstDudget.printAllIncomes();
                    System.out.println("Įveskite pajamo Nr, kurie norite ištrinti:");
                    int numForDelete = Integer.parseInt(sc.nextLine());
                    myFirstDudget.getIncomes().remove(numForDelete - 1);
                    System.out.printf("Išlaida Nr %d ištrinta!\n", numForDelete);
                }
                case "q" -> {
                    System.out.println("GAME OVER / VISO GERO ;)");
                }
            }
        } while (!"q".equals(inputComand));

        sc.close();

    }

    private static void printMainMenu() {
        System.out.println("--------------");
        System.out.printf("CONTROLS => " +
                "\n b -> gauti budžeto balansa," +
                "\n pc -> Print Išlaido Sarašas," +
                "\n pi -> Print Pajamu Sarašas," +
                "\n dc -> Ištrinti Išlaida iš saraša," +
                "\n di -> Ištrinti Pajama iš saraša," +
                "\n q -> Quit program \n");
        System.out.println("--------------");
    }

    private static void setTestInfoToBudget(Budget myFirstDudget) {
        myFirstDudget.addCostToList(BigDecimal.valueOf(10000.55), CategoryOfCost.POILSIS, PaymentMethods.KORTELE, CreditCards.KORTELE1);
        myFirstDudget.addCostToList(BigDecimal.valueOf(50.21), CategoryOfCost.ZAIDIMAI, PaymentMethods.KORTELE, CreditCards.KORTELE2);
        myFirstDudget.addCostToList(BigDecimal.valueOf(12.22), CategoryOfCost.MAISTA, PaymentMethods.KORTELE, CreditCards.KORTELE3);

        System.out.println("-------------------------------------------------------------------------------------");

        myFirstDudget.addIncomeToList(BigDecimal.valueOf(1000.23), CategoryOfCost.KITAS, true, "Algos pervedimas");
        myFirstDudget.addIncomeToList(BigDecimal.valueOf(1300.55), CategoryOfCost.KITAS, true, "Algos pervedimas");
        myFirstDudget.addIncomeToList(BigDecimal.valueOf(212.43), CategoryOfCost.KITAS, false, "Algos pervedimas, uz papildomi funkcijos");
        myFirstDudget.addIncomeToList(BigDecimal.valueOf(5000.43), CategoryOfCost.KITAS, true, "Premija už 2021m");

        System.out.println("-------------------------------------------------------------------------------------");
    }
}
