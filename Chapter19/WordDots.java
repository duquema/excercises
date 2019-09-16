import java.util.Scanner;

public class WordDots
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Yo enter the first word:");
		String first = scan.nextLine();
		
		scan = new Scanner(System.in);
		System.out.println("Now enter a second!");
		String second = scan.nextLine();

		int length = 30 - first.length() - second.length();
		int i = 0;
		String dots = "";

		while (i < length){
			i += 1;
			dots += ".";
		}

		String endstring = first + dots + second;
		System.out.println(first + dots + second);
		System.out.println(endstring.length());
	}
}