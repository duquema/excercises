import java.util.Scanner;
public class CorrectChange
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How much change do you need back?");
		int initialcents = scan.nextInt();
		int dollars = initialcents / 100;
		int quarters = (initialcents - dollars * 100) / 25;
		int dimes = (initialcents - dollars * 100 - quarters * 25) / 10;
		int nickels = (initialcents - dollars * 100 - quarters * 25 - dimes * 10) / 5;
		int pennies = (initialcents - dollars * 100 - quarters * 25 - dimes * 10 - nickels * 5) / 1;

		System.out.println("Your change is " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
	}
}