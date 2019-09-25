import java.util.Scanner;
public class BirthdayParadox
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many guests are coming to your dope party??");
    int people = scan.nextInt();

    double probability = 1.0;

    for (int i = 0; i <= people; i++){
      probability = probability * ( (365.0 - i) / 365);
    }

    System.out.println("The probability that " + people + " people have the same birthday is " + probability * 100 + " %");

    int j = 1;
    double probability2 = 1.0;
    int ideal = 0;

    for (j = 1; probability2 <= 0.5; j++){
      probability2 = probability2 * ( (365.0 - j) / 365);
      ideal += 1;
    }

    System.out.println("When there are " + ideal + " people, the probability of two having the same birthday is fifty percent.");
  }
}
