package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);



        while (true) {
            try {
                System.out.println("Баланс "+bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                bankAccount.withDraw((int) bankAccount.getAmount());
                System.out.println("Доступный баланс для снятия: " +
                        bankAccount.getAmount());
                break;
            }
        }








    }
}

