package model;

import java.util.Scanner;

public class CardAcceptor implements MoneyAcceptor {
    @Override
    public int getAmount() {
        return Integer.MAX_VALUE; // для упрощения – без лимита
    }

    @Override
    public void addAmount(int amount) {
        System.out.println("На карточке уже есть средства. Пополнение не требуется.");
    }

    @Override
    public boolean deductAmount(int amount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер карты:");
        String card = sc.nextLine();
        System.out.println("Введите одноразовый пароль:");
        String pass = sc.nextLine();
        System.out.println("Покупка на сумму " + amount + " успешно списана с карты " + card);
        return true;
    }
}