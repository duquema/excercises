import java.util.Random;

public class RandomWalk
{
	public static void main (String[] args)
	{
		double x = 0.0;
		double y = 0.0;
		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			double preplusx = rand.nextDouble();
			double plusx = preplusx * 2 - 1;
			System.out.println(plusx);
			x += plusx;
			
			double preplusy = rand.nextDouble();
			double plusy = preplusy * 2 - 1;
			y += plusy;
		}

		double distance = Math.sqrt(x * x + y * y);

		System.out.println("the coordinates of the ant are: (" + x + "," + y + ")");
		System.out.println("It has traveled " + distance + " distance. that's not very far");
	}
}