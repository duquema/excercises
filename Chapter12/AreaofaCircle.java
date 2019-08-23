import java.util.Scanner;
public class AreaofaCircle
{
	public static void main (String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Input the radius please:");
	int radius = scan.nextInt();
	double area = radius * radius * Math.PI;

	System.out.println("The radius is: " + radius + " The area is: " + area);
	}
}