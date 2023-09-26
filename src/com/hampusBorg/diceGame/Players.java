package com.hampusBorg.diceGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Players {

    public ArrayList<Player> playerList;

    public void assertWinner() {
        for (Player player : playerList) {
            player.rollPlayerDices();
        }
        //Hitta max Score
        //https://www.baeldung.com/java-collection-min-max
        int maxScore = playerList
                .stream()
                .max(Comparator.comparing(Player::getScore))
                .orElseThrow(NoSuchElementException::new).getScore();
        //Alla som har score = max score sätt wonRound = true
        ArrayList<Player> winners = new ArrayList<Player>(playerList);
        winners.removeIf(s -> s.getScore() < maxScore);
        if (winners.size() > 1) {
            System.out.println("We have a tie between");
            for (Player winner : winners)
                System.out.println(winner.name + " ");
            System.out.println("Congratulations to you all! 😄");
        } else {
            for (Player winner : winners)
                System.out.println("You won " + winner.name + "!");
        }
    }

    public Players(ArrayList<Player> players) {
        playerList = players;

    }


}




