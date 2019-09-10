import java.util.Scanner;
public class TownDump
{
  public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("How much does that GARBAGE weigh??");
       int weight = scan.nextInt();

       int price = 0;

       if (weight <= 200){
         price = 20;
       } else {
         price = 20 + 8 * ((weight - 200) / 100);
       }

       System.out.println("That's gonna cost ya " + price + " ENTIRE dollars.");
    }
}
