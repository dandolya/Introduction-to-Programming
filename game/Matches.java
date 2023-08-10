package game;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int firstPoints = 0;
        int secondPoints = 0;
        for (int i = 0; i < Integer.valueOf(args[3]); i++) {
            final int result = new TwoPlayerGame(
                    new TicTacToeBoard(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2]), i),
                    new HumanPlayer(new Scanner(System.in)),
                    new HumanPlayer(new Scanner(System.in))
            ).play(true);
            switch (result) {
                case 1:
                    System.out.println("First player won");
                    if (i % 2 == 0) {
                        firstPoints++;
                    } else {
                        secondPoints++;
                    }
                    break;
                case 2:
                    System.out.println("Second player won");
                    if (i % 2 == 1) {
                        firstPoints++;
                    } else {
                        secondPoints++;
                    }
                    break;
                case 0:
                    System.out.println("Draw");
                    firstPoints++;
                    secondPoints++;
                    break;
                default:
                    throw new AssertionError("Unknown result " + result);
            }
            System.out.println("Score: " + firstPoints + " : " + secondPoints);
        }
    }
}
