class Jam
{
  // Instance Variables
  private String contents ;   // type of fruit in the jar
  private String date  ;      // date of canning
  private int capacity ;      // amount of jam in the jar


  // Constructors
  public Jam( String contents, String date, int size )
  {
    this . contents = contents  ;
    this . date = date ;
    capacity = size;
  }

  // Methods
  public boolean empty ()
  {
    return ( capacity== 0 ) ;
  }

  public String toString()
  {
    return contents + "   " +  date + "   " +  capacity + " fl. oz. \n" ;
  }

  public void spread ( int fluidOz )
  {
    if ( !empty() )
    {
      if ( fluidOz <= capacity )
      {
        System.out.println("\nSpreading " + fluidOz + " fluid ounces of " + contents + "\n");
        capacity = capacity - fluidOz ;
      }
      else
      {
        System.out.println("\nSpreading " + capacity + " fluid ounces of " + contents + "\n");
        capacity =  0 ;
      }
     }
     else
       System.out.println("\nNo jam in the Jar!\n");
  }

}