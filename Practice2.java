package week_2_Day2;

import java.util.Scanner;

class Pattern {
  int num;

  public void getnum(int num) {
    this.num = num;
  }

  public void printPattern(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

public class Practice2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    Pattern obj = new Pattern();
    obj.getnum(num);
    obj.printPattern(num);

  }
}