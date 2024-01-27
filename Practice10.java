package week_2_Day2;

import java.util.Scanner;

class SumOfNum {
  int num;

  public void getNum(int num) {
    this.num = num;
  }

  public int printSum(int num) {
    int sum = 0;
    for (int i = 0; i <= num; i++) {
      sum = sum + i;
    }
    return sum;
  }
}

public class Practice10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    SumOfNum obj = new SumOfNum();
    obj.getNum(num);
    System.out.println(obj.printSum(num));

  }
}