public class PantryTest3
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );
    Jam toe   = new Jam( "Toe", "4/20/69", 9);

    Pantry3 hubbard = new Pantry3( goose, apple, rhub );
    System.out.println( hubbard );

    if ( hubbard.select(3) )
      hubbard.spread(2);
    else
      System.out.println("Selection not available");
    System.out.println( hubbard );

    hubbard.replace( toe, 3 );
    System.out.println( hubbard );

    if ( hubbard.select(3) )
      hubbard.spread(2);
    else
      System.out.println("Selection not available");
    System.out.println( hubbard );
    
  }
}