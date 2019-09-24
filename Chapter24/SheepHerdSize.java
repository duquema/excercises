import java.util.Scanner;
public class SheepHerdSize
{
	public static void main (String[] args)
	{
		int i = 0;
		double n = 0;
		double power = 1;
		for (i = 0; i <= 25; i++){
			n = 220 / (1 + 10 * power);
			power *= 0.83;
			System.out.println("Years: " + i + " sheep pop: " + n);
		}
		
	}
}