import java.util.Scanner;
public class DiscountPrices
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of purchases in cents: ");
		int price = scan.nextInt();
		if (price > 1000){
			double discount = price - price * 0.1;
			System.out.println("Discounted price: " + discount);
		}
		else {
			System.out.println("No discount! The price is still: " + price);
		}

	}

}