package oop1.Ex;

public class Account {
    int balance; //잔엑

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}

    /*int deposit(int amount) { //입금 메서드
        return balance += amount;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + balance);
        }
        return balance;
    }*/


