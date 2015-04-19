package ru.kurilenko;


public class Human {
    public int summ(Coin[] coins) {
        int summ = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i].getWear() > 50) {
                summ = summ + coins[i].getType().getWorth();
            } else if (coins[i].getWear() > 25) {
                summ = summ + coins[i].getType().getWorth() / 2;
            }

            coins[i].setWear(coins[i].getWear() - (int) Math.round(Math.random()*10));
        }
        return summ;
    }
}
