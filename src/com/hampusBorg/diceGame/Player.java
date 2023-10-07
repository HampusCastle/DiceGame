package com.hampusBorg.diceGame;

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
        System.out.println(this.name + " is rolling their dices");
        Thread.sleep(2000);
        this.score = this.dices.rollAllDices();
        System.out.println(this.name + " scored a total of " + this.score + " !");
        Thread.sleep(1000);
    }


}
