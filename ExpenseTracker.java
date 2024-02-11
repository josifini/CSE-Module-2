// File: ExpenseTracker.java
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {
    private List<Expense> expenses;
    private static final String FILE_NAME = "expenses.ser";

    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
        loadExpensesFromFile();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void listExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        System.out.println("All Expenses:");
        expenses.forEach(System.out::println);
    }

    public void saveExpensesToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(expenses);
            System.out.println("Expenses saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving expenses: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadExpensesFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                expenses = (ArrayList<Expense>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error loading expenses: " + e.getMessage());
            }
        } else {
            expenses = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
    
        while (!quit) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Save & Quit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline after number input
    
            switch (option) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    double amount = 0;
                    boolean valid = false;
                    while (!valid) {
                        System.out.print("Enter amount: ");
                        try {
                            amount = scanner.nextDouble();
                            valid = true; // Amount successfully received, break the loop
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a numerical value.");
                            scanner.nextLine(); // Consume the invalid input and prompt again
                        }
                    }
                    scanner.nextLine(); // Consume newline after number input
                    tracker.addExpense(new Expense(category, amount));
                    System.out.println("Expense added successfully: " + category + ": $" + String.format("%.2f", amount));
                    break;
                case 2:
                    tracker.listExpenses();
                    break;
                case 3:
                    tracker.saveExpensesToFile();
                    quit = true;
                    System.out.println("Exiting and saving expenses...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close(); // Optionally close the scanner when done
    }
}
    