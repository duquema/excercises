import java.util.Scanner;
import java.lang.Math;
public class WindChill
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What's the wind speed broski?");
		double speed = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("What's the temperature brotha?");
		double temp = scan.nextDouble();

		double equation = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

		if (speed < 3 || temp > 50){
			System.out.println("The wind chill is " + temp);
		} else{
			System.out.println("The wind chill is " + equation);
		}
	}
}