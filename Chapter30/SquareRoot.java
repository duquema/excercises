import java.util.Scanner;
import java.util.Random;

public class SquareRoot
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rounds would you like to play?");
		int rounds = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("Player 1, what is your name?");
		String player1 = scan.nextLine();

		scan = new Scanner(System.in);
		System.out.println("Player 2, what is your name?");
		String player2 = scan.nextLine();

		Random rand = new Random();

		int wincount1 = 0;
		int wincount2 = 0;

		for (int i = 0; i < rounds; i++){
			double number = rand.nextDouble() * 100;
			System.out.println("What is the square root of " + number);

			scan = new Scanner(System.in);
			System.out.println(player1 + ", what is your guess");
			double guess1 = scan.nextDouble();

			scan = new Scanner(System.in);
			System.out.println(player2 + ", what is your guess");
			double guess2 = scan.nextDouble();

			double squareroot = Math.sqrt(number);

			System.out.println("The real square root is " + squareroot);

			double distance1 = Math.abs(squareroot - guess1);
			double distance2 = Math.abs(squareroot - guess2);

			System.out.println(player1 + " is " + distance1 + " away");
			System.out.println(player2 + " is " + distance2 + " away");

			if (distance1 > distance2){
				System.out.println(player2 + " wins!!");
				wincount2 += 1;
			} else if (distance2 > distance1){
				System.out.println(player1 + " wins!!");
				wincount1 += 1;
			} else{
				System.out.println("You guys tied what the heck - choose different numbers");

			}
		}

		System.out.println("Final Score:\n" + player1 + ": " + wincount1 + "    " + player2 + ": " + wincount2);
	}
}
