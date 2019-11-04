public class TestBox
{
	public static void main (String[] args)
	{
	
	Box box = new Box(2.5, 5.0, 6.0);
	Box oldbox = new Box(box);
	Box bigbox = box.biggerBox(box);
	Box smallbox = box.smallerBox(box);

	System.out.println("Area: " + box.area() + " Volume: " + box.volume());
	System.out.println("Area: " + oldbox.area() + " Volume: " + oldbox.volume());
	System.out.println("Area: " + bigbox.area() + " Volume: " + bigbox.volume());
	System.out.println("Area: " + smallbox.area() + " Volume: " + smallbox.volume());
	System.out.println("Could the smaller box fit in the bigger box? " + bigbox.nests(box));
	
	}
}