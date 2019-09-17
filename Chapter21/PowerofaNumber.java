import java.util.Scanner;
public class PowerofaNumber
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want x to be?");
		double x = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("What do you want n to be?");
		double n = scan.nextDouble();

		int i = 1;
		double sum = x;

		while (i < n){
			sum = x * sum;
			i += 1;
		}

		if (n >= 0){
			System.out.println(x + " raised to the power of " + n + " is: " + sum);
		} else{
			System.out.println("YOU MORON N HAS TO BE POSITIVE!!!!!!!!!!!!!!!!!");
		}
	}
}