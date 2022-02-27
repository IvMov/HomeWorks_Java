package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.util.Scanner;

public class Programa {
    public static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        String inputComandMainMenu;
        Budget myFirstDudget = new Budget();

        setTestInfoToBudget(myFirstDudget);

        do {
            printMainMenu();
            inputComandMainMenu = SC.nextLine();

            switch (inputComandMainMenu) {
                case "b" -> {
                    myFirstDudget.getInfoBudgetBalance();
                }
                case "pt" -> {
                    myFirstDudget.printAllTransactions();
                }
                case "pc" -> {
                    myFirstDudget.printAllCosts();
                }
                case "pi" -> {
                    myFirstDudget.printAllIncomes();
                }
                case "dt" -> {
                    myFirstDudget.printAllTransactions();
                    System.out.println("Įveskite ID transakcijos, kurie norite ištrinti," +
                            " ar įveskite \"qq\"- grižti atgal.");
                    myFirstDudget.loopToDeleteTransactions();
                }
                case "cc" -> {
                    myFirstDudget.printAllCosts();
                    myFirstDudget.changeCostInList();
                }
                case "ci" -> {
                    myFirstDudget.printAllIncomes();
                    myFirstDudget.changeIncomeInList();
                }
                case "q" -> {
                    System.out.println("GAME OVER / VISO GERO ;)");
                }
            }
        } while (!"q".equals(inputComandMainMenu));

        SC.close();

    }

    private static void printMainMenu() {
        System.out.println("------------------------------------------");
        System.out.printf("CONTROLS => " +
                "\n b -> gauti budžeto balansa," +
                "\n pt -> Print Transakciju Sarašas," +
                "\n pc -> Print Išlaido Sarašas," +
                "\n pi -> Print Pajamu Sarašas," +
                "\n dt -> Ištrinti Transakcija iš saraša," +
                "\n cc -> Koreguoti Išlaida saraše," +
                "\n ci -> Koreguoti Pajama saraše," +
                "\n q -> Quit program \n");
        System.out.println("------------------------------------------");
    }


    private static void setTestInfoToBudget(Budget myFirstDudget) { //4 test pajamos ir 4 test išlaidos sukurimas.
        Transaction transaction1 = new Cost(BigDecimal.valueOf(-1000.55),
                TransactionCategory.KITAS,
                PaymentMethods.KORTELE,
                CreditCards.KORTELE1,
                "bla bla");
        Transaction transaction2 = new Cost(BigDecimal.valueOf(-34.25),
                TransactionCategory.KITAS,
                PaymentMethods.KORTELE,
                CreditCards.KORTELE1,
                "bla bla2");
        Transaction transaction3 = new Cost(BigDecimal.valueOf(-500),
                TransactionCategory.KITAS,
                PaymentMethods.GRYNAIS,
                CreditCards.NOCARD,
                "bla bla3");
        Transaction transaction4 = new Cost(BigDecimal.valueOf(-424.55),
                TransactionCategory.KITAS,
                PaymentMethods.KORTELE,
                CreditCards.KORTELE1,
                "bla bla4");

        myFirstDudget.addNewTransactionToList(transaction1);
        myFirstDudget.addNewTransactionToList(transaction2);
        myFirstDudget.addNewTransactionToList(transaction3);
        myFirstDudget.addNewTransactionToList(transaction4);


        System.out.println("-------------------------------------------------------------------------------------");

        Transaction transaction5 = new Income(BigDecimal.valueOf(1000),
                TransactionCategory.KITAS,
                true,
                "Algos pervedimas");
        Transaction transaction6 = new Income(BigDecimal.valueOf(2000),
                TransactionCategory.KITAS,
                true,
                "Algos pervedimas");
        Transaction transaction7 = new Income(BigDecimal.valueOf(500),
                TransactionCategory.KITAS,
                true,
                "Algos pervedimas");
        Transaction transaction8 = new Income(BigDecimal.valueOf(10),
                TransactionCategory.KITAS,
                true,
                "Premija už 2021m 4");

        myFirstDudget.addNewTransactionToList(transaction5);
        myFirstDudget.addNewTransactionToList(transaction6);
        myFirstDudget.addNewTransactionToList(transaction7);
        myFirstDudget.addNewTransactionToList(transaction8);

        System.out.println("-------------------------------------------------------------------------------------");
    }
}
