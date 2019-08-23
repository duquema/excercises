import java.util.Scanner;
public class Ohms
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the voltage?"); 
		int v = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is the resistance?"); 
		int r = scan2.nextInt();

		double i = (v + 0.0) / r;
		System.out.println(i + " is the current");
	}
}