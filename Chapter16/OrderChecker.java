import java.util.Scanner;
public class OrderChecker
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many bolts you want?");
		int bolts = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("How many nuts you want?");
		int nuts = scan.nextInt();

		scan = new Scanner(System.in);
		System.out.println("How many washers you want?");
		int washers = scan.nextInt();

		int boltprice = bolts * 5;
		int nutprice = nuts * 3;
		int washerprice = washers;
		int totalprice = boltprice + nutprice + washerprice;

		if (nuts >= bolts && washers >= bolts * 2){
			System.out.println("Number of bolts: " + bolts);
			System.out.println("Number of nuts: " + nuts);
			System.out.println("Number of washers: " + washers);
			System.out.println("You orders aight buddy");
			System.out.println("Total cost: " + totalprice);

		} else if (nuts < bolts){
			System.out.println("Number of bolts: " + bolts);
			System.out.println("Number of nuts: " + nuts);
			System.out.println("Number of washers: " + washers);
			System.out.println("too few nuts moron");
			System.out.println("Total cost: " + totalprice);

		} else if (washers < bolts * 2){
			System.out.println("Number of bolts: " + bolts);
			System.out.println("Number of nuts: " + nuts);
			System.out.println("Number of washers: " + washers);
			System.out.println("too few washers moron");
			System.out.println("Total cost: " + totalprice);

		} else {
			System.out.println("Number of bolts: " + bolts);
			System.out.println("Number of nuts: " + nuts);
			System.out.println("Number of washers: " + washers);
			System.out.println("Yikes");
			System.out.println("Total cost: " + totalprice);
		}

	}
}