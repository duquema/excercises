import java.util.Scanner;
public class LastChanceGas
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your tank capacity?");
		double capacity = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("What percent do you have left in your tank?");
		double percent = scan.nextDouble() * 0.01;

		scan = new Scanner(System.in);
		System.out.println("What is your miles per gallon?");
		double mpg = scan.nextDouble();

		if (percent *  capacity * mpg >= 200){
			System.out.println("KEEEEEEEEEP GOINGGGG");
		
		} else{
			System.out.println("Get some gas my guy");
		}

	}
}