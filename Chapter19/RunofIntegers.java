import java.util.Scanner;
public class RunofIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What numero would you like to start with?");
		int initial = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("What numero would you like to end with?");
		int end = scan.nextInt();

		for (int i = initial; i <= end; i++){
		System.out.println(i);
		}
	}
}