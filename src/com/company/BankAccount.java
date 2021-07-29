package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        System.out.println(amount += sum);
        return amount;
    }

    public void withDraw(int sum) throws LimitException {
        for (int i = 0; ; i++) {
            if (amount - sum < 0) {
                throw new LimitException("На балансе недостаточно средтсв", sum);
            } else {
                System.out.println("Баланс: " + getAmount() + "\n Снято: " + sum
                        + "\n Остаток после снятия: " + (amount -= sum));
            }

        }
    }
}
