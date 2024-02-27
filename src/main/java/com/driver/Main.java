package com.driver;

public class Main {
    public static void main(String[] args) {
        BankAccount ac_1 = new BankAccount("pd",4000,1000);
        ac_1.deposit(3000);
        try {
           System.out.println( ac_1.generateAccountNumber(5, 28));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(ac_1.getMinBalance());
        try {
            ac_1.withdraw(8000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(ac_1.getBalance());
        System.out.println("rest of code");
    }
}