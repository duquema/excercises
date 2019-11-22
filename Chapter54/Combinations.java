import java.util.Scanner;

public class Combinations
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int r;

		System.out.println("Welcome to the Combination Calculator!");
		System.out.println("Enter n");
		n = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Enter r");
		r = scan.nextInt();

		long combo = combination(n, r);

		if (combo >= 0){
			System.out.println("The combination of " + n + " and " + r + " is " + combo);
		} else{
			System.out.println("Error: n too high / you dripped too hard :(");
		}
	}

	public static long findFactorial(int num)
	{
		if (num > 20){
			return -1;
		} else {
			long fct = 1;
	    	for (int j=1; j<=num; j++){
	      		fct *= j;
	   		}
	   		return fct;
		}
	}

	public static long combination(int n, int r)
	{
		return findFactorial(n) / (findFactorial(r) * (findFactorial(n-r)));
	}
}