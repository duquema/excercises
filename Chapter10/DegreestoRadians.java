public class DegreestoRadians
{
	public static void main (String[] args)
	{
		double degrees = 30;
		double radians = degrees * Math.PI/180;
		double sinx = Math.sin(radians);
		double cosx = Math.cos(radians);
		double sum = sinx * sinx + cosx * cosx;
		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );

	}
}