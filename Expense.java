// File: Expense.java
import java.io.Serializable;

public class Expense implements Serializable {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return category + ": $" + String.format("%.2f", amount);
    }
}

