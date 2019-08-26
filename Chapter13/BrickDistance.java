import java.util.Scanner;
public class BrickDistance
{
	public static void main(String[] args) 
	{
		double g = 32.174;
		System.out.println("Enter the number of seconds brother:");
		Scanner scan = new Scanner(System.in);
		
		double t = scan.nextDouble();
		double d = 0.5 * t * t * g;

		System.out.println("This is how far the brick fell:" + d);
	}
}