public class Box
{
	private double width;
	private double height;
	private double length;

	public Box(double width, double height, double length)
	{
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public double volume()
	{
		return width * height * length;
	}

	public double area()
	{
		return (width * height + width * length + height * length) * 2;
	}

	public void setWidth()
	{

	}
}