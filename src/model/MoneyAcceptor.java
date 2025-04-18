package model;

public interface MoneyAcceptor {
    int getAmount();
    void addAmount(int amount);
    boolean deductAmount(int amount);
}
