import java.util.Random;

public class SnakeLadderUC2 {

    static int dice;

    public static void main(String[] args) {

        diceChoice();

    }

    public static void diceChoice() {

        Random rand = new Random();
        dice = rand.nextInt(7);

        if (dice == 0) {

            dice = dice + 1;

        }

        System.out.println("Dice Value: " +dice);

    }
}
