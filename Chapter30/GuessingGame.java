import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
	public static void main (String[] args)
	{
		Random random = new Random();
		int x = random.nextInt(10);

		Scanner scan = new Scanner(System.in);
		System.out.println("I'm thinking of a number between one and ten; if you guess within three tries you get a piece of candy!");
		int guess = scan.nextInt();
		int i = 1;

		while (i < 3){
			if (guess == x){
				System.out.println("Woah you actually guessed it. Good job, but I actually lied sorry. There is no candy for you :(");
				i = 4;
			} else{
				System.out.println("Haha wrong. Guess again idiot.");
				i += 1;
				guess = scan.nextInt();
			}
		}

		if (i == 3){
			System.out.println("You suck bro, no candy for you. The right number was " + x);
		}
	}
}
