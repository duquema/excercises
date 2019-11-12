class Pantry2
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;
  private boolean validselection;

  // Constructors
  Pantry2( Jam jar1, Jam jar2)
  {
    this.jar1 = jar1 ;
    this.jar2 = jar2 ;
    selected = null ;
  }

  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString();
    str += "2: " +  jar2.toString();
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if (jarNumber == 1 || jarNumber == 2){
      
      if ( jarNumber == 1 ){
        selected =  jar1;
        return true;
      }

      else if ( jarNumber == 2 ){
        selected = jar2;
        return true;
      }
    }
  
    return false;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
}