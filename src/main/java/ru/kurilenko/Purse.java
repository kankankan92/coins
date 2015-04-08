package ru.kurilenko;


import java.util.Random;

public class Purse {
    public Coin giveCoin(CoinType type){
        return new Coin(type);
    }

    public Coin giveCoin(){
        return null;
    }
}
