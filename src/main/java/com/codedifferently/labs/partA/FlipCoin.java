package com.codedifferently.labs.partA;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        for( int i = 0; i < 20; i++) {
            if (chance < .5) {
                System.out.println("heads");
            } else {
                System.out.println("heads");
            }
            System.out.println(chance);
        }
    }
}
