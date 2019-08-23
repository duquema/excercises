import java.util.Scanner;
public class CentstoDollars
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the cents por favor:");
		int initialcents = scan.nextInt();
		int dollars = initialcents / 100;
		int finalcents = initialcents - dollars * 100;

		System.out.println("That is " + dollars + " dollars and " + finalcents + " cents.");
	}
}