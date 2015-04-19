package ru.kurilenko;

public class Coin {
    public CoinType getType() {
        return type;
    }

    private CoinType type;
    private int wear = 100;

    public Coin(CoinType type) {
        this.type = type;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }
}
