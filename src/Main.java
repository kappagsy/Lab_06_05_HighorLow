import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int val = generator.nextInt(10) + 1;
        int guess = 0;

        System.out.print("Choose a number between 1 through 10: ");

        if(in.hasNextInt())
        {
           guess = in.nextInt();
           in.nextLine();
        }

        if(guess == val)
        {
            System.out.println("You guessed correctly! Nice guess!");
        }

        if(guess > val)
        {
            System.out.println("Your guess is too high! The random number generator chose: " + val + ".");
            if (guess > 10)
            {
                System.out.println("The number you chose is not in range of 1 through 10. Please try again.");
                System.exit(0);
            }
        }

        if(guess < val)
        {
            System.out.println("Your guess is too low! The random number generator chose: " + val + ".");
            if (guess < 1)
            {
                System.out.println("The number you chose is not in range of 1 through 10. Please try again.");
                System.exit(0);
            }
        }
    }
}