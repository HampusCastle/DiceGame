package com.hampusBorg.diceGame;

import java.io.IOException;


public class Player {
    public String name;
    private int score = 0;
    public Dices dices;
    public int getScore(){
        return this.score;
    }

    public Player(String name, int numberOfDices){
        this.name = name;
        this.dices = new Dices(numberOfDices);
    }

    public void rollPlayerDices() throws InterruptedException {
        System.out.println(this.name + " is rolling, press enter to continue");
        waitingForInput();
        this.score = this.dices.rollAllDices();
        System.out.println(this.name + " scored a total of " + this.score + " !\n");
    }
    private void waitingForInput() {
        try {
            int number;
            while((number = System.in.read()) != -1 && number != '\n'); {
            }
        } catch (IOException error) {
            error.printStackTrace();
        }


}
}
