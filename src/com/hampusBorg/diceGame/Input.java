package com.hampusBorg.diceGame;

import java.util.Scanner;

public class Input {
    private static Scanner _scanner;

    public Input() {
        _scanner = new Scanner(System.in);
    }

    public int inputInt() {
        while (!_scanner.hasNextInt()) {
            System.out.println("Please enter a correct number");
            _scanner.next();
        }
        int result = _scanner.nextInt();
        _scanner.nextLine(); //https://stackoverflow.com/questions/22542833/different-java-scanner-for-input-of-different-types
        return result;
    }

    public String inputString() {
        return _scanner.nextLine();
    }
}

