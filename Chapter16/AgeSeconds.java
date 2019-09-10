import java.util.Scanner;
public class AgeSeconds
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many years have you lived?");
		int years = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("How many months??");
		int months = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("How many days???");
		int days = scan.nextInt();

		int totalmonths = 0;

		if (months == 1){
			totalmonths = 31;
		}
		else if (months == 2){
			totalmonths = 31 + 28;
		}
		else if (months == 3){
			totalmonths = 31 + 28 + 31;
		}
		else if (months == 4){
			totalmonths = 31 + 28 + 31 + 30;
		}
		else if (months == 5){
			totalmonths = 31 + 28 + 31 + 30 + 31;
		}
		else if (months == 6){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30;
		}
		else if (months == 7){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30 + 31;
		}
		else if (months == 8){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		}
		else if (months == 9){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		else if (months == 10){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		else if (months == 11){
			totalmonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}

		int totaldays = years * 365 + totalmonths + days;

		System.out.println(totaldays);
	}
}