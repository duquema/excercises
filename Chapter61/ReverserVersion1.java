import java.io.* ;

class ReverserVersion1
{

  public static void main ( String[] args )
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int temp;

    // write out the new data
    for (int i = 0; i < data.length / 2; i++) {
      temp = data[i];
      data[i] = data[data.length - i - 1];
      data[data.length - i - 1] = temp;

    }
  }
}
