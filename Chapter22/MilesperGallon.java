import java.util.Scanner;
public class MilesperGallon
{
  public static void main (String[] args)
  {
    System.out.println("Welcome to this sick MPG calculator!");
    int i = 0;

    while (i == 0){
      Scanner scan = new Scanner(System.in);
      System.out.println("What's your initial miles??");
      int initialmiles = scan.nextInt();

      if (initialmiles >= 0){
        scan = new Scanner(System.in);
        System.out.println("What's your final miles??");
        int finalmiles = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("How many gallons did that take??");
        int gallons = scan.nextInt();

        double mpg = (finallmiles - initialmiles) / gallons;

        System.out.println("Ayeeeeee your mpg is " + mpg);

      } else{
        System.out.println("Goodbye have a wonderful day.");
        i += 1;
      }
    }

  }
}
