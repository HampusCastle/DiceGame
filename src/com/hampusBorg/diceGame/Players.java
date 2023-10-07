package com.hampusBorg.diceGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Players {

    public ArrayList<Player> playerList;

    public void assertWinner() throws InterruptedException {
        for (Player player : playerList) {
            player.rollPlayerDices();
            Thread.sleep(2000);
        }
        //Hitta max Score - https://www.baeldung.com/java-collection-min-max
        int maxScore = playerList
                .stream()
                .max(Comparator.comparing(Player::getScore))
                .orElseThrow(NoSuchElementException::new).getScore();

        ArrayList<Player> winners = new ArrayList<>(playerList);
        winners.removeIf(s -> s.getScore() < maxScore);
        if (winners.size() > 1) {
            System.out.println("There has been a tie!");
            Thread.sleep(2000);
            for (Player winner : winners)
                System.out.println(winner.name + " Congratulations to you! 😄" );
        } else {
            for (Player winner : winners)
                System.out.println(winner.name + " won!\n Congratulations and well played.");
            Thread.sleep(2000);
        }
    }

    public Players(ArrayList<Player> players) {
        playerList = players;

    }


}




