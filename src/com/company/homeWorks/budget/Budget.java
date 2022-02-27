package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.util.ArrayList;

import static com.company.homeWorks.budget.Programa.*;

public class Budget {

    private static BigDecimal budgetBalance = BigDecimal.valueOf(18000.23); // random start value
    private ArrayList<Transaction> transactions = new ArrayList<>();


    public void addNewTransactionToList(Transaction transactionToAdd) {
        transactions.add(transactionToAdd);
        budgetBalance = budgetBalance.add(transactionToAdd.summ);
        transactionToAdd.printNewTransactionInfo();
        getInfoBudgetBalance();
    }

    public void printAllTransactions() {
        System.out.println("Visi transakcijos: ");
        for (Transaction transaction : transactions) {
            transaction.printTransactionInfo();
        }
    }

    public void printAllCosts() {
        ArrayList<Cost> allCosts = getAllCosts();
        System.out.println("Visi išlaidos: ");
        for (Cost cost : allCosts) {
            cost.printTransactionInfo();
        }
    }

    public void printAllIncomes() {
        ArrayList<Income> allIncomes = getAllIncomes();
        System.out.println("Visi pajamai: ");
        for (Income income : allIncomes) {
            income.printTransactionInfo();
        }
    }

    public void loopToDeleteTransactions() {
        String quit = "";
        do {
            if (SC.hasNextInt()) {
                int numForDelete = Integer.parseInt(SC.nextLine());
                if (getIdArray().contains(numForDelete)) {
                    removeTransactionsByID(numForDelete);
                    System.out.printf("Transakcija Nr %d ištrinta!\n", numForDelete);
                    System.out.println("Dar viena ištrinti - įveskite ID, " +
                            "atgal i menu - \"qq\".");
                } else {
                    System.out.println("Įveskite teisingi skaičiu");
                }
            } else {
                System.out.println("Įvestas ne skaičius.");
                quit = SC.nextLine();
            }
        } while (!"qq".equals(quit));
    }

    public void changeCostInList() {
        int idToChange = 0;
        boolean idFound = false;

        while (!idFound) {
            idToChange = checkInputedScan("Įslaidos");

            for (int i = 0; i < getAllCosts().size(); i++) {
                if (getAllCosts().get(i).id == idToChange) {
                    idFound = true;
                    getAllCosts().get(i).changeTransaction();
                }
            }
            if (!idFound) {
                System.out.println("pajama su tokiu ID: " + idToChange + " nerasta!");
            }
        }
    }

    public void changeIncomeInList() {
        int idToChange = 0;
        boolean idFound = false;

        while (!idFound) {
            idToChange = checkInputedScan("Pajamos");

            for (int i = 0; i < getAllIncomes().size(); i++) {
                if (getAllIncomes().get(i).id == idToChange) {
                    idFound = true;
                    getAllIncomes().get(i).changeTransaction();
                }
            }
            if (!idFound) {
                System.out.println("pajama su tokiu ID: " + idToChange + " nerasta!");
            }
        }

    }

    public void getInfoBudgetBalance() {
        System.out.printf("Saskaitoje: %.2f EUR \n", budgetBalance);
        ;
    }

    private ArrayList<Cost> getAllCosts() { //filter from all transactions only Costs
        ArrayList<Cost> costs = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction instanceof Cost) {
                costs.add((Cost) transaction);
            }
        }
        return costs;
    }

    private ArrayList<Income> getAllIncomes() { //filter from all transactions only Incomes
        ArrayList<Income> incomes = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction instanceof Income) {
                incomes.add((Income) transaction);
            }
        }
        return incomes;
    }

    private ArrayList<Integer> getIdArray() {
        ArrayList<Integer> arrayWithId = new ArrayList<>();
        for (Transaction transaction : transactions) {
            arrayWithId.add(transaction.id);
        }
        return arrayWithId;
    }

    private void removeTransactionsByID(int idToRemove) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).id == idToRemove) {
                budgetBalance = budgetBalance.subtract(transactions.get(i).summ);
                transactions.remove(i);
            }
        }
    }

    private int checkInputedScan(String costOrIncome) {
        int idToChange;
        while (true) {
            try {
                System.out.println("Įveskite " + costOrIncome + " ID, kurie norite pakeisti:");
                idToChange = Integer.parseInt(SC.nextLine());
                System.out.println("Koregavimas baigtas.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Klaida Įvestas ne skaičius");
            }
        }
        return idToChange;
    }

    public static BigDecimal getBudgetBalance() {
        return budgetBalance;
    }

    public static void setBudgetBalance(BigDecimal budgetBalance) {
        Budget.budgetBalance = budgetBalance;
    }
}
