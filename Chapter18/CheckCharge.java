import java.util.Scanner;
public class CheckCharge
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Yo how much money do you have in your checking account??");
    int checking = scan.nextInt();

    scan = new Scanner(System.in);
    System.out.println("Now how much do you have in your savings?");
    int savings = scan.nextInt();

    if (checking >= 1000 || savings >= 1500){
      System.out.println("There is no service charge for writing checks! Good for you!");
    } else {
      System.out.println("There is a fifteen cent charge for writing checks broke boy.");
    }
  }
}
