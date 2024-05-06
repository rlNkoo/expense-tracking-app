package pl.rlnkoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();

    public void displayAllExpenses() {
        expenses.forEach(ExpenseManager::displayExpenses);
    }

    private static void displayExpenses(Expense expense) {
        System.out.println("Description: " + expense.description());
        System.out.println("Type: " + expense.type());
        System.out.println("Value: " + expense.value() + "$");
        System.out.println("Month: " + expense.month());
        System.out.println();
    }

    public void addExpense(Scanner scanner) {
        System.out.println("Expense description:");
        String expenseDescription = scanner.nextLine();
        System.out.println("Expense type:");
        String expenseType = scanner.nextLine();
        System.out.println("Expense value:");
        double expenseValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Month of expense:");
        int expenseMonth = Integer.parseInt(scanner.nextLine());

        Expense expense = new Expense(expenseType, expenseMonth, expenseValue, expenseDescription);
        expenses.add(expense);
    }

    public void displayMonthlyExpenses(Scanner scanner) {
        System.out.println("Which month do you want to view the expenses from?");
        int monthlyExpense = Integer.parseInt(scanner.nextLine());

        expenses.stream()
                .filter(expense -> expense.month() == monthlyExpense)
                .forEach(ExpenseManager::displayExpenses);
    }
}
