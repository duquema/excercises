import java.util.Scanner;

public class Cylinder
{
	// variables
	private double height;
	private double radius;
	private double surfacearea;
	private double volume;

	// constructors
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
		this.surfacearea = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
		this.volume = Math.PI * radius * radius * height;
	}

	// methods
	public double surfaceArea()
	{
		return surfacearea;
	}

	public double volume()
	{
		return volume;
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