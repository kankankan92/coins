package ru.kurilenko;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        Purse purse = new Purse();
        Human nastia = new Human();
        Coin[] coins = new Coin[10];
        for (int i = 0; i < coins.length; i++) {
            coins[i]=purse.giveCoin();
            System.out.println(coins[i].getType());
        }
        IntStream.range(0,20).forEach(i -> {
            nastia.summ(coins);
            System.out.println(coins[1].getWear());
        });



    }
}
