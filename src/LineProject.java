import java.util.Random;
import java.util.Scanner;

public class LineProject {
    private int userSoldier;
    private int enemySoldier;
    private int playerPosition;
    private int enemyPosition;
    private int enemyFirepower;
    private int userFirepower;

    Random random = new Random();
    Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        new LineProject().run();

    }

    private void run() {
        printMessageWelcome();
        userMovement();
        amountSoldiers();
        startingPosition();
        rollDice();

    }

    public void printMessageWelcome() {
        System.out.println("Welcome to Line Battle");


    }

    public void userMovement() {
        /* dice = rollDice();
        amountSoldiers();
        do {
            System.out.println("Choose your movement:");
            System.out.println("A: Move forward");
            System.out.println("B: Retreat");
            System.out.println("C: Attack");
            System.out.println("D: Place a bomb");
        }
        while (userSoldier > 0 && enemySoldier > 0);

            String userInput = in.nextLine(); // Get user input

            switch (userInput) {
                case "A":
                    System.out.println("You moved" + dice + "Fields forward");
                    break;
                case "B":
                    System.out.println("You moved" + dice + "Fields backwards");
                    break;
                case "C":
                    // Add code for attacking
                    break;
                case "D":
                    // Add code for placing a bomb
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }

         */
        amountSoldiers();
        int dice;

        while (userSoldier > 0 && enemySoldier > 0) {
            dice = rollDice();
            System.out.println("Choose your movement:");
            System.out.println("A: Move forward");
            System.out.println("B: Retreat");
            System.out.println("C: Attack");
            System.out.println("D: Place a bomb");

            String userInput = in.nextLine(); // Get user input

            switch (userInput) {
                case "A":
                    System.out.println("You moved " + dice + " fields forward");
                    break;
                case "B":
                    System.out.println("You moved " + dice + " fields backwards");
                    break;
                case "C":
                    // Add code for attacking
                    break;
                case "D":
                    // Add code for placing a bomb
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }

            amountSoldiers(); // Check soldiers after each move
        }

        if (userSoldier <= 0) {
            System.out.println("Player has lost the game.");
        } else if (enemySoldier <= 0) {
            System.out.println("Player has won the game.");
        }
    }
s


    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void startingPosition() {
        playerPosition = 10;
        enemyPosition = -10;
    }


    public void amountSoldiers() {
        userSoldier = 25;
        enemySoldier = 25;

        if (userSoldier == 0) {
            System.out.println("Player has lost the game.");
        }else if (enemySoldier == 0) {
            System.out.println("Player has won the game.");
        }



    }

    public void hasBomb() {







    }
    //TODO 1. Lave switch statement til hver bevægelse i spillet
    //TODO 2. Få usermovement til at være indtastningen i skanner for at aktivere switchstatement
    //TODO 3. udfyld hvad der sker i de forskellige switchstatement udfald
    //TODO 4. få udfaldene til at ændre placeringen på kortet baseret på dice udkastet

}
