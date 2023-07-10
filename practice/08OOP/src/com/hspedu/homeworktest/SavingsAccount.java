package com.hspedu.homeworktest;

public class SavingsAccount extends BankAccount{
    private int transNumber=0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void earnMonthlyInterest(){
       super.deposit(super.getBalance()*0.2);
       this.transNumber = 3;
    }

    @Override
    public void deposit(double amount){
        if(this.transNumber>0){
            this.transNumber--;
            super.deposit(amount);
        }
        else{
            super.deposit(amount-1);
        }
    }

    //取钱
    @Override
    public void withdraw(double amount){
        if(this.transNumber>0){
            this.transNumber--;
            super.withdraw(amount);
        }
        else{
            super.withdraw(amount+1);
        }
    }

}
