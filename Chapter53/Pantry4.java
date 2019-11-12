class Pantry4
{
  // Instance Variables
  private Jam4  jar1 ;
  private Jam4  jar2 ;
  private Jam4  jar3 ;
  private Jam4  selected ;

  // Constructors
  Pantry4( Jam4 jar1, Jam4 jar2, Jam4 jar3 )
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
  public void select( int jarNumber )
  {
    if ( jarNumber == 1 )
      selected =  jar1 ;

    else if ( jarNumber == 2 )
      selected = jar2 ;

    else
      selected = jar3 ;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }

  public int getAllOz(){
    int total = jar1.getOz() + jar2.getOz() + jar3.getOz();
    return total;
  }

  public String getFinalDate(){
    return jar1.getDate();
  }

    public void combine()
  {
    if (!jar1.getName().equals("Mixed Fruit")){
      if (jar1.getOz() < 3 && jar2.getOz() < 3 && jar3.getOz() < 3){
        Jam4 mixed = new Jam4("Mixed Fruit", getFinalDate(), getAllOz());
        Jam4 empty = new Jam4("Unavailable", "Sorry sweetie!", 0);
        jar1 = mixed;
        jar2 = empty;
        jar3 = empty;
      }
    }
  }

}