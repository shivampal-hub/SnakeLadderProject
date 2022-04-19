package com.bl.snake;

import java.util.Random;

public class DiceRoll extends SnakeLadderUC7 {

    private static int dice;

    public void diceChoice() {

        Random rand = new Random();
        dice = rand.nextInt(7);

        if (dice == 0) {

            dice = dice + 1;

        }

        System.out.println("Dice Value: " + dice);

    }

    public void playerChoiceOne() {

        int choice1;

        Random rand = new Random();
        choice1 = rand.nextInt(3);

        switch (choice1) {
            case 0:
                System.out.println("Choice = No Play(Stay at the same position)");
                position1 = position1;
                break;

            case 1:
                System.out.println("Choice = Ladder(Move ahead)");
                position1 = position1 + dice;
                diceChoice();
                playerChoiceOne();
                break;

            default:
                System.out.println("Choice = Snake(Move behind)");
                position1 = position1 - dice;
                break;

        }

        if (position1 < 0) {

            position1 = 0;

        }

        if (position1 > 100) {

            position1 = position1 - dice;

        }

        System.out.println("Position: " + position1);
        System.out.println();

    }

    public void playerChoiceTwo() {

        int choice2;

        Random rand = new Random();
        choice2 = rand.nextInt(3);

        switch (choice2) {
            case 0:
                System.out.println("Choice = No Play(Stay at the same position)");
                position2 = position2;
                break;

            case 1:
                System.out.println("Choice = Ladder(Move ahead)");
                position2 = position2 + dice;
                diceChoice();
                playerChoiceTwo();
                break;

            default:
                System.out.println("Choice = Snake(Move behind)");
                position2 = position2 - dice;
                break;

        }

        if (position2 < 0) {

            position2 = 0;

        }

        if (position2 > 100) {

            position2 = position2 - dice;

        }

        System.out.println("Position: " + position2);
        System.out.println();

    }
}
