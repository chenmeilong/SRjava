package com.hspedu.homeworktest;

public class HomeWork08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500.0);
        System.out.println("当前余额为"+savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println("满月计算利息");

        System.out.println("当前余额为"+savingsAccount.getBalance());

        savingsAccount.deposit(50);
        savingsAccount.withdraw(123);
        System.out.println("当前余额为"+savingsAccount.getBalance());
        savingsAccount.deposit(50);
        System.out.println("当前余额为"+savingsAccount.getBalance());
        savingsAccount.deposit(50);
        System.out.println("当前余额为"+savingsAccount.getBalance());

    }
}
