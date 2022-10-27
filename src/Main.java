import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);


        int die1 = rand.nextInt(1, 7);
        int die2 = rand.nextInt(1, 7);
        final int firstSum = die1 + die2;
        boolean done = false;
        boolean fin = false;
        String YN = "";
        boolean playAgain = false;


        System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

do{
        do {
            if (firstSum == 7 || firstSum == 11) {
                System.out.println("You win.");
                done = true;

            }
            if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
                System.out.println("You lose.");
                done = true;

            }


            int newSum = 0;
            while (newSum != firstSum && newSum != 7) {
                die1 = rand.nextInt(1, 7);
                die2 = rand.nextInt(1, 7);
                newSum = die1 + die2;
                System.out.printf("%d + %d = %d %n", die1, die2, newSum);
            }

            if (newSum == firstSum) {
                System.out.println("You win.");
                done = true;
            } else {
                System.out.println("You lose.");
                done = true;
            }
        } while (!done);

        System.out.println("Would you like to play again [Y/N]");
        if (in.hasNextLine()) {
            YN = in.nextLine();
        }
            if (YN.equalsIgnoreCase("N")) {
                System.out.println("Thanks for Playing!");
                break;

            } else if (YN.equalsIgnoreCase("Y")) {




            }
        }while(playAgain=true);
    }
}




