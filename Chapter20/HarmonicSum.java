import java.util.Scanner;
public class HarmonicSum
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want the integer limit to be while calculating harmonic sum?");
		int n = scan.nextInt();

		int i = 0;
		double sum = 0;

		while (i < n){
			i += 1;
			sum = 1.0/i + sum;
		}

		System.out.println("Your sum is: " + sum);
	}
}