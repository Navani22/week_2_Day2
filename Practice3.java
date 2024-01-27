package week_2_Day2;

import java.util.Scanner;

class SumOfNum {
  int num;

  public void getNum(int num) {
    this.num = num;
  }

  public int printSum(int num) {
    if (num == 0) {
      return 0;
    } else {
      return num + printSum(num - 1);
    }
  }
}

public class Practice3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    SumOfNum obj = new SumOfNum();
    obj.getNum(num);
   System.out.println( obj.printSum(num));

  }
}