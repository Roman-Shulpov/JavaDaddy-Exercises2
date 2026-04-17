package main.java.mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {
    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("ABC123");
        bankAccount.setBalance(1000.24);
        bankAccount.deposit(200);
        bankAccount.withdraw(15000);
        System.out.println(bankAccount.getBalance());
    }
}