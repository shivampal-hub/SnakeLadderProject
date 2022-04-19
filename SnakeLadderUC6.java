import java.util.Random;

public class SnakeLadderUC6 {

        static int dice, position = 0, count = 1;

        public static void main(String[] args) {

            do {

                diceChoice();
                playerChoice();
                count++;

            }

            while (position != 100);
            System.out.println("Number of times the dice was rolled to win the game is " +count);

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

            Random rand = new Random();
            choice = rand.nextInt(3);

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
