/**
 * Created by Praktika on 11.11.2016.
 */
import java.util.Random;
import java.util.Scanner;

public class exercise57 {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Random random = new Random();
        int myguess = random.nextInt(100) + 1;
        methodman(myguess);
    }
    public static void methodman(int myguess) {
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        int yourguess = in.nextInt();

        if (myguess < yourguess) {
            System.out.println("Your guess is too high");
            methodman(myguess);
        } else if (myguess > yourguess){
            System.out.println("Your guess is too low");
            methodman(myguess);
        } else {
            System.out.print("Your guess is on point! Gratz!");
        }

    }
}