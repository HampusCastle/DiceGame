package com.hampusBorg.diceGame;

import java.util.Scanner;

public class Input {
    private static Scanner _scanner;

    public Input() {
        _scanner = new Scanner(System.in);
    }

    public int inputInt() {
        while (!_scanner.hasNextInt()) {
            System.out.println("Please enter a correct number using the numbered keys :)");
            _scanner.next();
        }
        int result = _scanner.nextInt();
        _scanner.nextLine();
        return result;
    }

    public String inputString() {
        String inputString;
        do {
            inputString = getScanner().nextLine().trim();
            if (inputString.isEmpty() || !inputString.matches("^[a-öA-Ö ]*$")) {
                System.out.println("Give me some letters...");
            }
        } while (inputString.isEmpty() || !inputString.matches("^[a-öA-Ö ]*$"));
        return inputString;
    }

    public Scanner getScanner() {
        return _scanner;
    }
}


