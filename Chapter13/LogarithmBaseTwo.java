import java.util.Scanner;
public class LogarithmBaseTwo
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your double: ");
		double number = scan.nextDouble();
		double answer = Math.log(number) / Math.log(2);
		System.out.println("The Base 2 log of " + number + " is " + answer);
	}
}