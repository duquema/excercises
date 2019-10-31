import java.util.Scanner;

public class Cone
{
	// variables
	private double height;
	private double radius;
	private double area;
	private double volume;
	private double slantheight;
	private double angle;

	// constructors
	public Cone(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
		this.area = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
		this.volume = Math.PI * radius * radius * height / 3.0;
		this.slantheight = Math.sqrt(radius * radius + height * height);
		this.angle = Math.atan(radius / height);
	}

	// methods
	public double area()
	{
		return area;
	}

	public double volume()
	{
		return volume;
	}

	public double slantHeight()
	{
		return slantheight;
	}

	public double angle()
	{
		return angle;
	}

	public void setHeight()
	{
		if (height >= 0){
			this.height = height;
		}
	}

	public void setRadius()
	{
		if (radius >= 0){
			this.radius = radius;
		}
	}

	public double getHeight()
	{
		return height;
	}

	public double getRadius()
	{
		return radius;

	}
}