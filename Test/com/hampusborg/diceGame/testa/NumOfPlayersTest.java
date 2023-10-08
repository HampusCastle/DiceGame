package com.hampusborg.diceGame.testa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumOfPlayersTest {
    @Test
    void players() {
        int numOfPlayers = 3;
        System.out.println("Choose how many players to join the game! (Minimum 2 players)️");
        while (numOfPlayers < 2) {
            assertEquals(numOfPlayers < 2, numOfPlayers);
        }
    } }