package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Budget {


    private static BigDecimal budgetBalance = BigDecimal.valueOf(18000.23); // random start value

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addNewTransactionToList(Transaction transactionToAdd) {
        transactions.add(transactionToAdd);
        budgetBalance = budgetBalance.add(transactionToAdd.summ);
        transactionToAdd.getNewTransactionInfo();
        getInfoBudgetBalance();
    }

    public ArrayList<Cost> getAllCosts() {
        ArrayList<Cost> costs = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction instanceof Cost) {
                costs.add((Cost) transaction);
            }
        }
        return costs;
    }

    public ArrayList<Income> getAllIncomes() {
        ArrayList<Income> incomes = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction instanceof Income) {
                incomes.add((Income) transaction);
            }
        }
        return incomes;
    }

    public void printAllTransactions() {
        System.out.println("Visi transakcijos: ");
        for (Transaction transaction : transactions) {
            transaction.getTransactionInfo();
        }
    }

    public void printAllCosts() {
        ArrayList<Cost> allCosts = getAllCosts();
        System.out.println("Visi išlaidos: ");
        for (Cost cost : allCosts) {
            cost.getTransactionInfo();
        }
    }

    public void printAllIncomes() {
        ArrayList<Income> allIncomes = getAllIncomes();
        System.out.println("Visi pajamai: ");
        for (Income income : allIncomes) {
            income.getTransactionInfo();
        }
    }

    public void removeTransactions(int idToRemove) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).id == idToRemove) {
                budgetBalance = budgetBalance.subtract(transactions.get(i).summ);
                transactions.remove(i);
            }
        }
    }

    public void deletingTransactions() {
        String outFromCycle = "";
        do {
            if (Programa.SC.hasNextInt()) {
                int numForDelete = Integer.parseInt(Programa.SC.nextLine());
                removeTransactions(numForDelete);
                System.out.printf("Transakcija Nr %d ištrinta!\n", numForDelete);
                System.out.println("Dar viena ištrinti - įveskite ID, " +
                        "atgal i menu - \"qq\".");
            } else {
                outFromCycle = Programa.SC.nextLine();
            }
        } while (!"qq".equals(outFromCycle));
    }

    public void changeCostInList() {
        int idToChange = Integer.parseInt(Programa.SC.nextLine());
        for (int i = 0; i < getAllCosts().size(); i++) {
            if (getAllCosts().get(i).id == idToChange) {
                getAllCosts().get(i).changeTransaction();
            }
        }
    }

    public void changeIncomeInList() {
        int idToChange = Integer.parseInt(Programa.SC.nextLine());
        for (int i = 0; i < getAllIncomes().size(); i++) {
            if (getAllIncomes().get(i).id == idToChange) {
                getAllIncomes().get(i).changeTransaction();
            }
        }
    }


    public void getInfoBudgetBalance() {
        System.out.printf("Saskaitoje: %.2f EUR \n", budgetBalance);
        ;
    }

    public static BigDecimal getBudgetBalance() {
        return budgetBalance;
    }

    public static void setBudgetBalance(BigDecimal budgetBalance) {
        Budget.budgetBalance = budgetBalance;
    }
}
