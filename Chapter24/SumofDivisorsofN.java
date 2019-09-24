import java.util.Scanner;
public class SumofDivisorsofN
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you wanna make integer n??????");
		int n = scan.nextInt();
		int i = 1;
		int sum = 0;

		for (i = 1; i < n; i+=1){
			if (n % i == 0){
				sum = sum + i;
			}
		}

		System.out.println("The sum of the integers is " + sum);
	}
}