import java.util.Scanner;

public class PantryTest
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    int select = 0;

    Scanner scan;
    System.out.println("Hey there handsome, welcome to Mother Max's Pantry :)))\n");
    
    while (select != -1){
      Pantry max = new Pantry( goose, apple, rhub );
      System.out.println("The jams are: \n" + max + "Your choice babycakes!!\n");

      scan = new Scanner(System.in);
      System.out.println("Which jam do you want daddy? (1, 2, or 3)");
      select = scan.nextInt();

      if (select != -1){
        scan = new Scanner(System.in);
        System.out.println("How much you want on that ;) (ounces)");
        int spread = scan.nextInt();

        max.select(select);
        max.spread(spread);
        System.out.println(max);
      } else{
        System.out.println("We hope to see you again cutie. Real soon.");
      }
    }
  }
}