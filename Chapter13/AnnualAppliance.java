import java.util.Scanner;
public class AnnualAppliance
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost my man:");
		double cost = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the hours used my bro:");
		double hours = scan2.nextInt();
		double annualcost = cost * hours;

		System.out.println("Anddddddd the annual cost issssssssssss: " + annualcost);

	}
}