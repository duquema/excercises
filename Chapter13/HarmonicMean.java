import java.util.Scanner;
public class HarmonicMean 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X please:");
		double x = scan.nextDouble();
		scan = new Scanner(System.in);
		System.out.println("Enter Y please:");
		double y = scan.nextDouble();

		double arithmetic = (x + y) / 2;
		System.out.println("Arithmetic mean: " + arithmetic);

		double harmonic = 2 / (1 / x + 1 / y);
		System.out.println("Harmonic mean: " + harmonic);

	}
}
