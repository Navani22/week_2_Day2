package week_2_Day2;

public class Practice6 {

    public static double calculateAverage(double... values) {
      double sum = 0;
  
      for (double num : values) {
        sum = sum + num;
      }
  
      double average = sum / values.length;
      return average;
    }
  
    public static void main(String[] args) {
  
      double average = calculateAverage(5, 10, 15, 20);
      System.out.println("Average: " + average);
    }
  }
  