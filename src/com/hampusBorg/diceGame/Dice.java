package com.hampusBorg.diceGame;

import java.util.Random;

public class Dice {
    private int dice;

    public int roll() {
        Random random = new Random();

        dice = random.nextInt(1, 7);
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public int getDice() {
        return dice;
    }
}
