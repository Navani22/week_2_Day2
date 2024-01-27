package week_2_Day2;

public class Practice9 {
    public static double celsiusToFahrenheit(double celsius) {
      double f = ((celsius * 9) / 5) + 32;
      return f;
    }
  
    public static void main(String[] args) {
      double celsius = 30;
      double fahrenheit = celsiusToFahrenheit(celsius);
      System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
  }
  