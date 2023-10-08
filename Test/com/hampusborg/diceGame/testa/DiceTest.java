package com.hampusborg.diceGame.testa;

import com.hampusBorg.diceGame.Dice;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DiceTest {

    @Test
    void roll() {
        Dice dice = new Dice();
        for(int i = 0; i<100; i++) {
            System.out.println(dice.roll());
            dice.setDice(dice.roll());
            assertTrue(dice.getDice() >= 0 && dice.getDice() <= 7);
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
