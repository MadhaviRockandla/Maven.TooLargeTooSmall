import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int guessNum = rand.nextInt(500);
        Scanner input = new Scanner(System.in);
        int guess;


        System.out.println("Enter number between 1 and 500: ");
        guess = input.nextInt();


        if (guess == guessNum) ;

        else if (guess < guessNum) {
            System.out.println("Too small!");
        } else
        {
            System.out.println("Too large!");
        }
    }

}

