package com.hspedu.homeworktest;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    //存款收1元
    @Override
    public void deposit(double amount)  {
        super.deposit(amount-1);
    }
    //取款收一元
    @Override
    public void withdraw(double amount)  {
        super.withdraw(amount+1);
    }

}
