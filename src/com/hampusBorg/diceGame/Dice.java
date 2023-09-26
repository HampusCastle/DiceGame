package com.hampusBorg.diceGame;

import java.util.Random;

public class Dice {
    public int roll() {
        Random random = new Random();
        int dice;
        dice = random.nextInt(1, 6);
        return dice;
    }
}
