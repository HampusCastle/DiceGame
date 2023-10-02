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

    public void rollPlayerDices(){
        System.out.println(this.name + " is rolling their dices");
        this.score = this.dices.rollAllDices();
        System.out.println(this.name + " scored a total of " + this.score);
    }


}
