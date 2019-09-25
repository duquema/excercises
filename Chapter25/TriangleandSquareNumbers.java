import java.util.Scanner;
public class TriangleandSquareNumbers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER LIMIT:");
		int limit = scan.nextInt();

		int i = 1;
		boolean trianglenumber = false;
		boolean squarenumber = false;

		for (i = 1; i < limit; i++){
			
			int square = 0;
			int triangle = 0;
			int number = i;

			for (square = i; square > 0; square--){
				if (square * square == i){
					squarenumber = true;
				}
			}

			for (triangle = 0; number >= 0; triangle++){
				number -= triangle;
				if (number == 0){
					trianglenumber = true;
				}
			}
			
			if (squarenumber == true && trianglenumber == true){
				System.out.println(i + " is both a square and triangular number!");
			}
		}
		
		trianglenumber = false;
		squarenumber = false;
		// for (i = 0; i <= limit; i++){
		// 	squarenumber = (i * i);
		// 	System.out.println(squarenumber);
		// }
	}
}