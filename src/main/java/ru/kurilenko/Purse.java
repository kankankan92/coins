package ru.kurilenko;


import java.util.Random;

public class Purse {
    public Coin giveCoin(CoinType type){
        return new Coin(type);
    }

    public Coin giveCoin(){
        int totalCoinTypes = CoinType.values().length; // сколько всего типов монеток
        int randomTypeIndex = (int)(Math.random() * totalCoinTypes); // случайный порядковый номер
        CoinType type = CoinType.values()[randomTypeIndex];
        return new Coin(type);
    }
}
