import java.util.Random;

public class SnakeLadderUC5 {

    static int dice, position = 0;

    public static void main(String[] args) {

        System.out.println("Roll the dice to start the game of Snake and Ladder");
        System.out.println();

        do {

            diceChoice();
            playerChoice();

        }

        while (position != 100);
    }

    public static void diceChoice() {

        Random rand = new Random();
        dice = rand.nextInt(7);

        if (dice == 0) {

            dice = dice + 1;

        }

        System.out.println("Dice Value: " +dice);

    }
    public static void playerChoice () {

        int choice;

        Random rand1 = new Random();
        choice = rand1.nextInt(3);

        switch (choice) {
            case 0:
                System.out.println("Choice = No Play(Stay at the same position)");
                position = position;
                break;

            case 1:
                System.out.println("Choice = Ladder(Move ahead)");
                position = position + dice ;
                break;

            default:
                System.out.println("Choice = Snake(Move behind)");
                position = position - dice;
                break;

        }
            if (position < 0) {

                position = 0;

        }

            if(position > 100) {

                position = position - dice;

            }

                System.out.println("Position: " + position);
                    System.out.println( );
        }
    }