package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;
    private long accNumber;
    public BankAccount(String name, double balance, double minBalance) {
            this.name = name;
            this.balance=balance;
            this.minBalance = minBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        StringBuilder accountNumber = new StringBuilder();
        int remainingSum = sum;

        if (digits <= 0) {
            throw new IllegalArgumentException("Number of digits should be greater than 0");
        }

        for (int i = 0; i < digits; i++) {
            int digit = Math.min(remainingSum, 9); // Ensure the digit is between 0 and 9
            accountNumber.append(digit);
            remainingSum -= digit;
        }

        if (remainingSum != 0) {
            throw new Exception("Account Number can not be generated");
        }

        return accountNumber.toString();
    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance+=amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;

    }


}