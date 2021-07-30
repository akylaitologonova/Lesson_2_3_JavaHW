package com.company;

public class Main {

    public static void main(String[] args)  {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);



        while (true) {
            try {
                System.out.println("Баланс "+bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                System.out.println("Доступный баланс для снятия: " +
                        bankAccount.getAmount());
                break;
            }
        }








    }
}

