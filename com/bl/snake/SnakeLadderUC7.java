package com.bl.snake;

public class SnakeLadderUC7 {

    public static int position1 = 0, position2 = 0;

    public static void main(String[] args) {

        SnakeLadderUC7 snake = new SnakeLadderUC7();

        do {

            PlayerOne ladder1 = new PlayerOne();
            ladder1.chanceOne();

            PlayerTwo ladder2 = new PlayerTwo();
            ladder2.chanceTwo();

            if (position1 == 100) {

                System.out.println("Winner is Player One");
                break;

            }
            else if (position2 == 100) {

                System.out.println("Winner is Player Two");
                break;

            }


        }

        while ((position1 != 100) || (position2 !=100));

    }
}
