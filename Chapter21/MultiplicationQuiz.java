import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int i = 0;
		int amountright = 0;

		while (i < 10){
			int first = rand.nextInt(+10);
			int second = rand.nextInt(+10);
			System.out.println("What is " + first + " times " + second);
			int input = scan.nextInt();
			int sum = first * second;
			i += 1;
			if (sum == input){
				System.out.println("Nice! You can do basic math.");
				amountright += 1;
			} else{
				System.out.println("You fool. " + first + " times " + second + " equals " + sum);
			}
		}

		System.out.println("Wow you got " + amountright + " out of 10 questions right. Are you proud of that? Is that hole in your heart filled? No it will never be. Good job though :).");
	}
}