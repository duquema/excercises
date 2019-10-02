import java.util.Scanner;
import java.util.Random;

public class PasswordCracker
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want your password to be??");
		String password = scan.nextLine();

		Random random = new Random();
		String possibilities = ("qwertyuiopasdfghjklzxcvbnm");
		String guess = new String("");
		
		int count = 0;

		while (!guess.equals(password)){
			guess = "";
			
			for (int i = 1; i <= password.length(); i++){
				guess += possibilities.charAt(random.nextInt(possibilities.length()));
			}

			count++;
		}

		System.out.println("The password is: " + guess);
		System.out.println("It took " + count + " attempts to crack.");

	}
}