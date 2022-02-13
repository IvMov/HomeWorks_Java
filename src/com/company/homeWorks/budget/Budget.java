package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Budget {

    private ArrayList<Income> incomes = new ArrayList<>();
    private ArrayList<Cost> costs = new ArrayList<>();
    private BigDecimal budgetBalance = BigDecimal.valueOf(18000.23); // random start value in pocket

//   ----------------------- ISLAIDOS methods-------------------------

    public void addCostToList(BigDecimal summ,
                              CategoryOfCost category,
                              PaymentMethods paymentMethod,
                              CreditCards creditCard) {

        Cost cost = new Cost(summ, category, paymentMethod, creditCard);
        costs.add(cost);

        budgetBalance = budgetBalance.subtract(cost.getSumm());

        cost.getInfoAboutNewCost();
        getInfoBudgetBalance();

    }

    public void getCostInfoFromListByNumber(int operationUniqueNr) {
        Cost costForOutput = costs.get(operationUniqueNr - 1);
        costForOutput.getInfoAboutCost();
    }

    public void printAllCosts() {
        System.out.println("Visi išlaidos:");
        for (Cost cost : costs) {
            cost.getInfoAboutCost();
        }
        System.out.println("-----------------");
    }
    //   ----------------------- PAJAMOS methods-------------------------

    public void addIncomeToList(BigDecimal summ,
                                CategoryOfCost category,
                                boolean incomeIsGeted,
                                String comment) {

        Income income = new Income(summ, category, incomeIsGeted, comment);
        incomes.add(income);
        budgetBalance = budgetBalance.add(income.getSumm());

        income.getInfoAboutNewIncome();
        getInfoBudgetBalance();
    }

    public void getIncomeInfoFromListByNumber(int incomeUniqueNr) {
        Income incomeForOutput = incomes.get(incomeUniqueNr - 1);
        incomeForOutput.getInfoAboutIncome();
    }

    public void printAllIncomes() {
        System.out.println("Visi pajamai:");
        for (Income income : incomes) {
            income.getInfoAboutIncome();
        }
        System.out.println("-----------------");
    }

    //OTHER

    public void getInfoBudgetBalance() {
        System.out.printf("Saskaitoje: %.2f EUR \n", budgetBalance);
        ;
    }

    //GET

    public ArrayList<Income> getIncomes() {
        return incomes;
    }

    public ArrayList<Cost> getCosts() {
        return costs;
    }

    public BigDecimal getBudgetBalance() {
        return budgetBalance;
    }
}
