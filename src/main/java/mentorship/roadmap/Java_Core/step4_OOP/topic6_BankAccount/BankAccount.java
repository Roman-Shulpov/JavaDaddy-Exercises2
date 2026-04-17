package main.java.mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
