import java.util.Scanner;
public class FantasyGame
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to Joe Mama's Quest!");

		Scanner scan = new Scanner(System.in);
		System.out.println("NAME YOUR HERO:");
		String hero = scan.nextLine();

		System.out.println("Yopu have fifteen points to use between strength, health, and luck with a max of ten in each category.");

		scan = new Scanner(System.in);
		System.out.println("How strong are ya? (1-10)");
		int strength = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("How much health do ya have? (1-10)");
		int health = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("How lucky are ya? (1-10)");
		int luck = scan.nextInt();

		if (strength + health + luck <= 15){
			System.out.println("Oh wow " + hero + " has a strength of " + strength + " health of " + health + " and luck of " + luck);
		} else{
			System.out.println("Bro that's too many points!! Now " + hero + " has the default values of 5 strength 5 health and 5 luck");
		}
	}
}