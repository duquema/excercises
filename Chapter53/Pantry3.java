class Pantry3
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry3( Jam jar1, Jam jar2, Jam jar3 )
  {
    this.jar1 = jar1 ;
    this.jar2 = jar2 ;
    this.jar3 = jar3 ;
    selected = null ;
  }

  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString();
    str += "2: " +  jar2.toString();
    str += "3: " +  jar3.toString();     
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

      else if ( jarNumber == 3 ){
        selected = jar3;
        return true;
      }
    }
  
    return false;
  }

  public void replace(Jam j, int slot)
  {
    if (slot == 1)
      jar1 = j;
    if (slot == 2)
      jar2 = j;
    if (slot == 3)
      jar3 = j;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
}