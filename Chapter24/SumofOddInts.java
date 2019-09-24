import java.util.Scanner;
public class SumofOddInts
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you wanna make integer n??????");
		int n = scan.nextInt();
		int i = 1;
		int sum = 0;
		int square = n * n;

		for (i = 1; i <= n; i+=2){
			sum += i; 
		}

		System.out.println("Sum of odd ints is: " + sum + " and the square is: " + square);
	}
}