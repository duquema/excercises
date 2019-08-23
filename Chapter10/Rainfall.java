public class Rainfall
{
	public static void main (String[] args)
	{
		int april = 12;
		int may = 14;
		int june = 8;
		System.out.println("Rainfall for April: \t" + april);
		System.out.println("Rainfall for May: \t" + may);
		System.out.println("Rainfall for June: \t" + june);
		double average = (april + may + june) / 3.0;
		System.out.println("Average rainfall: \t" + average);
	}
}