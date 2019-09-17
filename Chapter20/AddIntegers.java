import java.util.Scanner;
public class AddIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many integers do you want to add?");
		int numberofintegers = scan.nextInt();

		int i = 0;
		int sum = 0;

		while (i < numberofintegers){
			scan = new Scanner(System.in);
			System.out.println("Put in a number:");
			int input = scan.nextInt();
			i += 1;
			sum = 0 + input + sum;
		}

		System.out.println("The sum is equal to " + sum);
	}
}