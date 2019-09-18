import java.util.Scanner;
public class EtotheX
{
  public static void main (String[] args)
  {
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want e to be to the power of?");
		int x = scan.nextInt();
		double number = 1;
		double sum = 0;
		int n = 0;

		while (number > 1.0E-12){
			double factorial = 1;
			double numerator = 1;

			for (int i = n; i > 0; i--){
				factorial *= i;
				numerator *= x;
			}

			number = numerator / factorial;
			sum += number;

			System.out.print("n: " + n + "\tnumber: " + number + "\tsum: " + sum + "\n");
			n += 1;
		}
		System.out.println("My e^x: " + sum);
		System.out.println("Forreal e^x: " + Math.exp(x));

	}
}
