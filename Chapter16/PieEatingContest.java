import java.util.Scanner;
public class PieEatingContest
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Sorry for the personal question, but how much do you weigh?");
		int weight = scan.nextInt();

		if (weight >= 220 && weight <= 280){
			System.out.println("You are good to go man!");
		} else {
			System.out.print("Get outta here scum");
		}
	}
}