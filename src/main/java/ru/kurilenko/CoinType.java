package ru.kurilenko;


public enum CoinType {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100);
    private int worth;

    CoinType(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }

}
