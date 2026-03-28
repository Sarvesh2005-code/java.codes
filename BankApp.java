package com.sarvesh.javabasics;

public class BankApp {
    static class BankAccount {
        private String name;
        private double balance;
        // setter
        public void setName(String name) {
            this.name = name;
        }
        // getter
        public String getName() {
            return name;
        }
        // deposit
        public void deposit(double amount) {
            if(amount > 0) {
                balance += amount;
            }
        }
        // withdraw
        public void withdraw(double amount) {
            if(amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Invalid transaction");
            }
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setName("Sarvesh");
        acc.deposit(1000);
        acc.withdraw(300);
        acc.display();
    }
}
