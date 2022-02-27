package com.company.homeWorks.budget;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

import static com.company.homeWorks.budget.File.*;

public class Programa {
    public static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String inputComandMainMenu; //string where will be var commands from user
        Budget myFirstDudget = new Budget();

        setTestInfoToBudget(myFirstDudget); //create test 4 incomes and 4 costs

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

                case "nc" -> {
                    myFirstDudget.addNewTransactionToList(Transaction.createNewCost());
                    System.out.println("Nauja įšlaida sukurta");
                }
                case "ni" -> {
                    myFirstDudget.addNewTransactionToList(Transaction.createNewIncome());
                    System.out.println("Nauja pajama sukurta");
                }
                case "cc" -> {
                    myFirstDudget.printAllCosts();
                    myFirstDudget.changeCostInList();
                }
                case "ci" -> {
                    myFirstDudget.printAllIncomes();
                    myFirstDudget.changeIncomeInList();
                }
                case "dt" -> {
                    myFirstDudget.printAllTransactions();
                    System.out.println("Įveskite ID transakcijos, kurie norite ištrinti," +
                            " ar įveskite \"qq\"- grižti atgal.");
                    myFirstDudget.loopToDeleteTransactions();
                }

                case "sd" -> {
                    saveDataToCSV(myFirstDudget.getTransactions());
                    saveObjDataToFile(myFirstDudget);
                    System.out.println("Duomenis sekmingai išsaugoti");
                }
                case "rd" -> {
                    Budget myNewBudget = readDataFromFile();
                    myNewBudget.printAllTransactions();
                    System.out.println("Duomenis sekmingai uploaded");
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

                "\n nc -> priedeti nauja išlaida" +
                "\n ni -> prideti nauja pajama" +
                "\n cc -> Koreguoti Išlaida saraše," +
                "\n ci -> Koreguoti Pajama saraše," +
                "\n dt -> Ištrinti Transakcija iš saraša," +

                "\n sd -> Išsaugoti duomenis į failą," +
                "\n rd -> Skaititi duomenis įš failo," +
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
                TransactionCategory.ZAIDIMAI,
                PaymentMethods.GRYNAIS,
                CreditCards.NOCARD,
                "bla bla3");
        Transaction transaction4 = new Cost(BigDecimal.valueOf(-424.55),
                TransactionCategory.MAISTA,
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
                TransactionCategory.KURAS,
                true,
                "Algos pervedimas");
        Transaction transaction7 = new Income(BigDecimal.valueOf(500),
                TransactionCategory.REMONTAS,
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
