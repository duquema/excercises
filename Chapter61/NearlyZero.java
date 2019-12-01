import java.io.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    // declare and initialize variables
    int closest = 100;

    // find the element nearest to zero
    for ( int i = 0; i < data.length; i++ )
    {
      if (closest > Math.abs(data[i]) - 0){
        closest = data[i];
      }
    }

    // write out the element nearest to zero
    System.out.println( "The closest number to zero is " + closest );

  }
}
