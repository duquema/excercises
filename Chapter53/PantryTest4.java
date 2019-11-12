import java.util.Scanner;

public class PantryTest4
{
  public static void main ( String[] args )
  {
    Jam4 goose = new Jam4( "Gooseberry", "7/4/86", 12 );
    Jam4 apple = new Jam4( "Crab Apple", "9/30/99", 8 );
    Jam4 rhub  = new Jam4( "Rhubarb", "10/31/99", 3 );

    int select = 0;

    Scanner scan;
    System.out.println("Hey there handsome, welcome to Mother Max's Pantry :)))\n");
    Pantry4 max = new Pantry4( goose, apple, rhub );
    
    while (select != -1){
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
        max.combine();
        
        System.out.println(max);
      } else{
        System.out.println("We hope to see you again cutie. Real soon.");
      }
    }
  }
}