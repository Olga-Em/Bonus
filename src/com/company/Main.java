package com.company;

public class Main {

    public static void main(String[] args) {
        int balance = 900;
        int refill = 1300;
        int oneBonus = 100;

        if (refill > 1000) {
            int bonus = refill / oneBonus;
            int finalScore = balance + refill + bonus;
            System.out.println("Итоговый счет = " + finalScore);
            System.out.println("Бонусных рублей начисленно " + bonus);
        }
        else {
            int finalScore = balance + refill;
            System.out.println("Итоговый счет = " + finalScore);
            System.out.println("Бонусные рубли не начислены");
        }
    }
}
