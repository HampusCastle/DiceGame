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

    @Test
    void Dice() {
        Dice dice = null;
        if (dice != null) {
            System.out.println("This object does not exist");
        } else {
            System.out.println("It does indeed work");
        }

    }


    }
