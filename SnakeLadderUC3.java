import java.util.Random;

public class SnakeLadderUC3 {

    static int dice;

    public static void main(String[] args) {

        diceChoice();
        playerChoice();

    }

    public static void diceChoice() {

        Random rand = new Random();
        dice = rand.nextInt(7);

        if (dice == 0) {

            dice = dice + 1;

        }

        System.out.println("Dice Value: " + dice);

    }

    public static void playerChoice() {

        int choice;

        Random rand1 = new Random();
        choice = rand1.nextInt(3);

        switch (choice) {
            case 0:
                System.out.println("Choice = No Play(Stay at the same position)");
                break;

            case 1:
                System.out.println("Choice = Ladder(Move ahead)");
                break;

            default:
                System.out.println("Choice = Snake(Move behind)");
                break;

        }
    }
}