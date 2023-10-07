package com.hampusborg.diceGame.testa;
import java.util.Random;
import com.hampusBorg.diceGame.Dice;
import com.hampusBorg.diceGame.Dices;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

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
    int players() {
        int numOfPlayers = 1;
        System.out.println("Choose how many players to join the game! (Minimum 2 players)️");
        while (numOfPlayers > 2) {
            assertEquals(numOfPlayers > 2, numOfPlayers);
            System.out.println("Enough players");
            if (numOfPlayers < 2) {
                System.out.println("The number has to be higher than 1");
            }
            return numOfPlayers;
        }
        return numOfPlayers;

    }
    @Test
    void Dice() {
        Dice dice = null;
        if (dice != null) {
            System.out.println("It does indeed work");
        } else {
            System.out.println("This object does not exist");
        }

    }


    }
