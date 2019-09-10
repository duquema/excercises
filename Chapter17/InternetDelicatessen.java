import java.util.Scanner;
public class InternetDelicatessen
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What item are you going to purchase today?");
		String item = scan.nextLine();
	
		scan = new Scanner(System.in);
		System.out.println("How much is that?");
		double price = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("Are you needy and want overnight delivery? Enter 0 for no or 1 for yes");
		int delivery = scan.nextInt();

		double deliveryprice = 0.00;

		if (delivery == 0 && price < 10.0){
			deliveryprice = 2.00;
		} else if (delivery == 1 && price < 10.0){
			deliveryprice = 5.00;
		} else if (price > 10.0){
			deliveryprice = 0.00;
		} else{
			System.out.println("Bruh you messed up; put 0 or 1");
		}

		double totalprice = deliveryprice + price;

		System.out.println(item + "   " + price);
		System.out.println("delivery" + "   " + deliveryprice);
		System.out.println("total" + "   " + totalprice);

	}
}