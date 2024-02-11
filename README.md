# Overview

To further my learning as a software engineer , I have created a simple program using Java language to keep track of daily expenses and spending habits. My hope is that I can learn Java syntax and demostrate the use of variables, expressions, conditions, loops, and functions.

This are some of the examples given in the ExpenseTracker Project.

* Variables:
Variables are used throughout the program to store data. For instance:

[private static ArrayList<Expense> expenses = new ArrayList<>();
private static final String FILE_NAME = "expenses.txt";]

Here, expenses is a variable that holds a list of Expense objects, and FILE_NAME is a constant that holds the name of the file where expenses are saved.

* Expressions
An expression is a combination of variables, operators, and method calls that are constructed according to the syntax of the language and that evaluates to a single value.

[double amount = scanner.nextDouble();]

In this line, scanner.nextDouble() is an expression that evaluates to the next double value entered by the user.

* Conditionals:
Conditionals are used to perform different actions based on different conditions. In the program, the switch statement is used as a conditional:

[switch (option) {
    case 1:
        addExpense(scanner);
        break;
    case 2:
        listExpenses();
        break;
    // Additional cases omitted for brevity
}
]

This switch statement executes different blocks of code based on the value of option.

* Loops:
A loop is used to execute a block of code repeatedly. The while loop in the program keeps running until the user decides to quit:

[while (!quit) {
    // Menu options and switch statement
}
]

This loop continues to show the menu and process the user input until quit becomes true.

* Functions (Methods):
Functions (or methods in Java) are blocks of code designed to perform a particular task. The addExpense method is an example:

[private static void addExpense(Scanner scanner) {
    // Implementation
}
]
This method adds a new expense by reading the category and amount from the user input.

* Classes:
A class is a blueprint for creating objects. In the program, the Expense class defines the structure for expense objects:

[public class Expense implements Serializable {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        // Constructor implementation
    }
    // Additional methods omitted for brevity
}
]
This class includes variables (category, amount), a constructor, and methods specific to the expense concept.

Each of these components plays a crucial role in the structure and functionality of the Java program, demonstrating fundamental programming concepts applicable across many programming tasks and languages.

# Stretch Challenge

File I/O Capabilities
In the ExpenseTracker class:

* Saving Expenses: The saveExpenses method serializes the expenses ArrayList to a file (expenses.txt) using ObjectOutputStream. This demonstrates writing objects to a file.
* Loading Expenses: The loadExpenses method deserializes the expenses ArrayList from the file (expenses.txt) at the start of the program using ObjectInputStream. This demonstrates reading objects from a file.
* Handling Expenses: Users can add new expenses and list all recorded expenses. This demonstrates using variables, expressions, conditionals, loops, functions, and classes.

[ExpenseTracker Demo](https://youtu.be/QtCNf5dFT6M)

# Development Environment

For the ExpenseTracker project, we utilized Java as the primary programming language. Java is a versatile, object-oriented language known for its portability, robustness, and high level of security, making it an excellent choice for building desktop, web, and mobile applications. Below are the tools, libraries, and features of Java used in developing the ExpenseTracker project:

* Java Development Kit (JDK)
Version: While the specific version wasn't mentioned, the JDK is essential for developing any Java application.

* Utilities: The javac compiler to compile the program, and the java command to run the compiled bytecode.

* Core Java Libraries
* java.io.Serializable: Interface used to mark the Expense class as serializable, enabling it to be written to and read from a file.
* java.io.ObjectOutputStream and java.io.ObjectInputStream: For serializing and deserializing objects to a file (expenses.ser). These classes handle the conversion of objects to a byte stream and the reverse process, crucial for the persistence feature of the ExpenseTracker.
* java.util.ArrayList: A resizable-array implementation of the List interface, used to store and manage a dynamic list of Expense objects.
* java.util.Scanner: A simple text scanner used for parsing primitive types and strings using regular expressions. In this project, it was employed to read user input from the console.
* java.util.List: An interface representing an ordered collection (also known as a sequence). The List interface was used to declare a reference type for storing a list of Expense objects.
* java.io.FileOutputStream and java.io.FileInputStream: To create an output stream for writing data to a file and an input stream for reading data from a file, respectively.
* java.io.File: Represents a file and directory pathnames in an abstract manner, used for checking the existence of the expenses.ser file before attempting to load expenses from it.
Development Environment
* IDE: The project could be developed in any Integrated Development Environment (IDE) that supports Java, such as Visual Studio Code with the Java Extension Pack. These IDEs provide features like syntax highlighting, code completion, debugging tools, and project management, which significantly enhance productivity.

# Conclusion

The ExpenseTracker project, as described, primarily relies on Java's standard libraries for its functionality, without the use of external libraries or frameworks. This approach keeps the project simple and focused, making it an excellent example for educational purposes or as a foundation for more complex applications.

# Useful Websites

- [Jav Tutorial - w3schools](https://www.w3schools.com/java/default.asp)
- [Java Reference](https://docs.oracle.com/en/java/javase/index.html)
- [Java Collections Framework - Beginners Book](https://beginnersbook.com/java-collections-tutorials/)
- [Java Wikipedia](https://en.wikipedia.org/wiki/Java_(programming_language))

# Future Work

- Intergrating with database using JDBC(Java Database Connectivity) for persistance
- Editing & Deleting Data
- Incorporating external libraries for additional features
