import com.hampusBorg.diceGame.Input;
import com.hampusBorg.diceGame.Player;
import com.hampusBorg.diceGame.Players;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TODO
        // Skapa ett träningsspel där man kan välja antal spelare - VG
        // Där man kan välja antal träningar
        // Där man kan välja spelarnas namn
        // Varje spelare ska ha en/flera träningar var där den med högst "poäng" vinner (minst 2 spelare).
        // För VG - Två vinnare - hantera detta på ett relevant sätt
        // Scanner befinner sig inom en egen klass
        //  Hantera att rätt svar kommer in under inmatning
        // Namn får bara vara ‘string’
        // Nummer får bara vara ‘integer’
        // Tre relevanta enhetstester


        Scanner sc = new Scanner(System.in);

//            ArrayList<Player> playerList = new ArrayList<>();
//
//            for(int i = 0; i < 5; i++) {
//                Player player = new Player();
//                player.name = "Player " + (i + 1);
//                System.out.println(player.name);
//
//                playerList.add(player);
//
//
//            }
//            for(int i = 0; i < playerList.size(); i++) {
//                playerList.get(i);
//                System.out.println(playerList.get(i).name);
//            }


        System.out.println("Welcome to the Dice game of complete superiority to every other Dice game!");
        // Welcoming you to the dice game.
        Input input = new Input();

        boolean isPlaying = true;


        do {
            // Här startar spelet

            int usedDices = 0;
            while (usedDices <= 1) {
                System.out.println("How many dices should we use for this game? More than one please!");
                usedDices = input.inputInt();
                if (usedDices < 2) {
                    System.out.println("There should be more than 1 dice, so the minimum is 2\n Please state how many dices you want to use");
                }

            }

            int numOfPlayers = 0;
            while (numOfPlayers < 2) {
                System.out.println("Choose how many players to join the game! (Minimum 2 players)️");
                numOfPlayers = input.inputInt();
                if (numOfPlayers < 2) {
                    System.out.println("The number has to be higher than 2");
                }
            }

            System.out.println("There are " + numOfPlayers + " players joining the game!");

            ArrayList<Player> playerList = new ArrayList<>();

            for (int i = 0; i < numOfPlayers; i++) {
                System.out.println("What is Player " + (i + 1) + "'s name?");
                Player player = new Player(input.inputString(), usedDices);
                playerList.add(player);
            }

            Players players = new Players(playerList);

            players.assertWinner();

            //Spela

            //Bestäm vem som vann

            //Spela igen?
            boolean isValid;
            do {
                isValid = true;
                System.out.println("Do you want to play again?\n Enter yes or no");
                String selection = input.inputString();
                switch (selection) {
                    case "yes":
                        break;
                    case "no":
                        System.out.println("Well, hope to see you soon");
                        isPlaying = false;
                        break;

                    default:
                        System.out.println("Please choose one of the options");
                        isValid = false;
                        break;
                }
            } while (isValid == false);

            System.out.println("Game has finished");
        } while (isPlaying);

// Instantiate objects

        // använd sides ist för points, välj hur många sidor tärningen ska ha

    }
}


