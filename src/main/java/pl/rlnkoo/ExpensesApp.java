package pl.rlnkoo;

import java.util.Scanner;

public class ExpensesApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        while (true) {
            System.out.println();
            System.out.println("Select an option:");
            System.out.println();
            System.out.println("1. Display all expenses");
            System.out.println("2. Display expenses for selected month");
            System.out.println("3. Add expense");
            System.out.println("4. Finish the application");
            System.out.println();

            int selectedOption = Integer.parseInt(scanner.nextLine());

            switch (selectedOption) {
                case 1 -> expenseManager.displayAllExpenses();
                case 2 -> expenseManager.displayMonthlyExpenses(scanner);
                case 3 -> expenseManager.addExpense(scanner);
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
