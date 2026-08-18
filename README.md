# 🏧 ATM Machine – Java

A simple **ATM Machine simulation built using Java**. This project demonstrates fundamental Java programming concepts such as **classes, objects, encapsulation, methods, conditional statements, user input, and basic banking operations**.

## 📌 Project Overview

This ATM Machine allows a user to securely access their account using a PIN and perform basic banking operations through a console-based menu.

The available operations are:

* 🔐 PIN Authentication
* 💰 Check Account Balance
* 💸 Withdraw Money
* 💵 Deposit Money
* 🚪 Exit the ATM

The project is designed as a beginner-friendly Java application to practice **Object-Oriented Programming (OOP)** concepts.

## ✨ Features

### 🔐 PIN Verification

The user must enter the correct PIN before accessing the ATM menu.

**Default PIN:**

```text
1234
```

### 💰 Check Balance

Displays the current account balance.

### 💸 Withdraw Money

Allows the user to withdraw money from their account.

The program checks whether sufficient balance is available before completing the withdrawal.

### 💵 Deposit Money

Allows the user to deposit money into their account.

### 🚪 Exit

The user can exit the ATM menu by selecting option `4`.

## 🛠️ Technologies Used

* **Java**
* **Java Scanner Class**
* **Object-Oriented Programming**
* **Console/Command Line Interface**

## 📂 Project Structure

```text
ATM-Machine/
│
├── ATMMachine.java
└── README.md
```

## 🧠 Java Concepts Used

This project helps practice the following concepts:

* Classes and Objects
* Encapsulation
* Private Variables
* Public Methods
* Constructors and Object Creation
* Conditional Statements
* `if-else` statements
* `Scanner` for User Input
* Methods and Method Calling
* Arithmetic Operators
* Access Modifiers
* Basic Control Flow

## ⚙️ How the Program Works

### Step 1: Create an ATM Account

An object of the `ATM` class is created:

```java
ATM account1 = new ATM();
```

### Step 2: PIN Verification

The program asks the user to enter their PIN.

```text
Enter your pin:
```

If the PIN is correct, the ATM menu is displayed.

### Step 3: Select an Operation

The user can select one of the following options:

```text
Enter Your Choice.
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. EXIT
```

### Step 4: Perform the Operation

Depending on the user's choice, the corresponding method is called:

```text
1 → checkBalance()
2 → withdrawMoney()
3 → depositMoney()
4 → Exit
```

## ▶️ How to Run

### 1. Install Java

Make sure Java JDK is installed on your computer.

Check your Java installation using:

```bash
java -version
```

### 2. Compile the Program

Open the terminal in the project directory and run:

```bash
javac ATMMachine.java
```

### 3. Run the Program

```bash
java ATMMachine
```

## 🖥️ Example Output

```text
Enter your pin:
1234

Enter Your Choice.
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. EXIT

1

Balance: 0.0
```

Example of depositing money:

```text
Enter Your Choice.
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. EXIT

3

Enter amount to Deposite:
5000

Money Deposite successful
```

Example of withdrawing money:

```text
Enter Your Choice.
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. EXIT

2

Enter amount to Withdraw:
2000

Money Withdraw successful
```

## 🔒 Default Account Details

| Detail          | Value             |
| --------------- | ----------------- |
| PIN             | `1234`            |
| Initial Balance | `0.0`             |
| Account Type    | Simulated Account |

> **Note:** This is an educational console-based project and does not connect to a real banking system.

## 🚀 Future Improvements

The project can be enhanced by adding:

* Multiple users/accounts
* PIN change functionality
* Maximum withdrawal limit
* Transaction history
* Account number
* Transfer money feature
* Multiple PIN attempts
* PIN masking
* Input validation
* File/database storage
* GUI using Java Swing or JavaFX
* Exception handling
* Better menu looping instead of recursive method calls

## 🎯 Learning Objective

The main objective of this project is to understand how **Java OOP concepts and basic programming logic** can be used to create a real-world application simulation.

It provides practical experience with user input, data manipulation, conditional logic, methods, classes, objects, and encapsulation.

## 👨‍💻 Author

**Ayush Jha**

Computer Science Student | Aspiring Software Developer | Data Science Enthusiast

---

⭐ If you find this project useful, consider giving the repository a **star**!
