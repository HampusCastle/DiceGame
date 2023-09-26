package com.hampusBorg.diceGame;

import java.util.ArrayList;

public class Dices {
    public ArrayList<Dice> diceList;

    public int rollAllDices() {
        int score = 0;
        for (Dice dice : diceList) {
            int diceRoll = dice.roll();
            System.out.println("The dice rolled " + diceRoll);
            score += diceRoll;
        }
        System.out.println("Good job, your average score was " + score / diceList.size());
        return score;
    }

    public Dices(int numberOfDices) {
        diceList = new ArrayList<>();
        for (int i = 0; i < numberOfDices; i++) {
            diceList.add(new Dice());
        }
    }
}
