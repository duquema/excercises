import java.util.Scanner;
public class SumofIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey brother what do you want N to be? (integers only please)");
		int n = scan.nextInt();

		int i = 0;
		int sum = 0;

		while (i < n){
			i += 1;
			sum += i;
		}

		int sum2 = (n*(n+1))/2;
		
		System.out.println("When you use the loop it equals " + sum);
		System.out.println("When you use the formula it equals " + sum2);
	}
}