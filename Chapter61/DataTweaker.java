public class DataTweaker
{
  public static void main (String[] args)
  {
    double data[] = {13, 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};

    System.out.println("The original average is " + average(data));
    System.out.println("The outlier is " + outlier(data));

    double newAverage = (average(data) * data.length - outlier(data)) / (data.length - 1);

    System.out.println("The new average is " + newAverage);

  }

  public static double average(double data[])
  {
    double sum = 0.0;
    double average = 0.0;
    for (int i = 0; i < data.length; i++){
      sum += data[i];
    }
    average = sum / data.length;

    return average;
  }

  public static double outlier(double data[]){
    double furthest = 0.0;
    double distance = 0.0;
    double temp = 0.0;

    for (int i = 0; i < data.length; i++){
      distance = Math.abs(data[i]) - 0;
      if (distance > temp){
        furthest = data[i];
        temp = distance;
      }
    }

    return furthest;
  }
}
