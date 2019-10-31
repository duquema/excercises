import java.util.Scanner;

public class TestCylinder
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    double radius;
    double height;

    System.out.print("Enter radius: "); 
    radius = scan.nextDouble();

    System.out.print("Enter height: "); 
    height = scan.nextDouble();
 
   Cylinder cylinder = new Cylinder(radius, height);

    System.out.println("Surface area "  + cylinder.surfaceArea() + " Volume: " + cylinder.volume());
  }
}