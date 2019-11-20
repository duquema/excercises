import java.util.Scanner;

public class OdiousNumbers
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		while (number >= 0){
			System.out.println("Put in a number");
			number = scan.nextInt();
			System.out.println(number + " in binary is: " + findBinary(number));
			System.out.println("Is it odious??: " + odious(findBinary(number)));
		}
		
		System.out.println("I hope that helped brotha");


	}

	public static String findBinary(int number){
		
		String binary = "";
		for (int i = number; i > 0; i = i / 2){
			if (i % 2 == 1) binary += "1";
			if (i % 2 == 0) binary += "0";
		}
		
		String binaryFixed = "";
		for (int i = binary.length(); i>0; i--){
			binaryFixed += binary.charAt(i - 1);
		}
		return binaryFixed;
	}

	public static boolean odious(String numberBinary){
		int onecount = 0;
		for (int i = numberBinary.length() - 1;  i>=0; i--){
			if (numberBinary.charAt(i) == '1') onecount += 1;
		}
		if (onecount % 2 == 0) return false;
		else return true;
	}

}