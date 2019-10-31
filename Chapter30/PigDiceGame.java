import java.util.Scanner;
import java.util.Random;

public class PigDiceGame
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int compturn = 0;
		int playerturn = 0;
		int compscore = 0;
		int playerpotentialscore = 0;
		int playerscore = 0;
		int i = 0;

		System.out.println("Hello gamer welcome to Pig!");

		while (compscore <= 100 && playerscore <= 100){
			i = 0;
			compturn = rand.nextInt(15) + 3;
			compscore += compturn;
			System.out.println("The computer rolls three dice and got " + compturn + " giving them a total score of " + compscore);

			System.out.println("Okay buddy your turn to roll.");
			playerturn = rand.nextInt(6) + 1;
			
			while(i == 0){
				if (playerturn != 1){

					playerpotentialscore += playerturn;
					System.out.println("You rolled a " + playerturn);
					
					System.out.println("Want to roll again? y or n");
					String choice = scan.nextLine();
					if (choice.equals("y")){
						playerturn = rand.nextInt(6) + 1;
					} else {
						playerscore += playerpotentialscore;
						playerpotentialscore = 0;
						System.out.println("Good job on your self control! Your score is now " + playerscore +"\n");
						i = 1;
					}

				} else{
					System.out.println("DAMN. You rolled a 1. You get zero added to your score. Your score is still " + playerscore + ". It's the computers turn again.\n");
					i = 1;
					playerturn = 0;
					playerpotentialscore = 0;
				}
			}
		}

		if (playerscore > compscore){
			System.out.println("You are awesome and won this game!");
		} else {
			System.out.println("You are awesome and did not win this game!");
		}
	}
}