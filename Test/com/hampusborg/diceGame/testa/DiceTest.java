package com.hampusborg.diceGame.testa;

import com.hampusBorg.diceGame.Dice;
import com.hampusBorg.diceGame.Dices;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll() {
        Dice dice = new Dice();
        for(int i = 0; i<100; i++) {
            System.out.println(dice.roll());
        }
    }

    public String name;
    public Dices dices;
    @Test
    void players() {
        int numOfPlayers = 10;
        while (numOfPlayers < 2) {
            System.out.println("Choose how many players to join the game! (Minimum 2 players)️");
            if (numOfPlayers < 2) {
                System.out.println("The number has to be higher than 1");
            }
        }
}
    @Test
    void lastTest() {

    }


    }
