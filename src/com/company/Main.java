package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);



        try {
            bankAccount.withDraw(6000);
            bankAccount.withDraw((int) bankAccount.getAmount());
        } catch (LimitException limitExeption) {
            System.out.println(limitExeption.getMessage());
            System.out.println("Доступный баланс для снятия: " + bankAccount.getAmount() + "\n Ваш баланс после снятия доступного баланса: " + (bankAccount.getAmount() - bankAccount.getAmount()));

        }








    }
}

