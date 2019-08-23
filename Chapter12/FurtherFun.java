import java.util.Scanner;
public class FurtherFun
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string my guy:");
		String ogstring = scan.nextLine();
		String newstring = ogstring.substring(6, 9);
		
		System.out.println("Here's the old string:" + ogstring);
		System.out.println("Here's the new string:" + newstring);
	}
}