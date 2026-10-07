package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ATM atm = new ATM();
        System.out.println(atm.balance);
        atm.deposit(1000);
        System.out.println(atm.balance);
        atm.withdraw(321);
        System.out.println(atm.balance);
    }
}

class ATM {
    int balance = 0;
    int deposit(int money) {  //Method;
        balance = balance + money;
        return balance;
    }
    int withdraw(int money) {  //Method;
        if (balance>=money) {
            balance = balance - money;
        }
        else {
            System.out.println("存款餘額不足, 無法提款!!!");
        }
        return balance;
    }
}
