package week_2_Day2;

import java.util.Scanner;

class SeriesFibo {
  int num;

  public void getNum(int num) {
    this.num = num;
  }

  public int printFibo(int num) {
    if (num <= 1) {
      return num;
    } else {
      return printFibo(num - 1) + printFibo(num - 2);
    }
  }
}

public class Practice5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    SeriesFibo obj = new SeriesFibo();
    obj.getNum(num);
    System.out.println("Fibonacci Series up to " + num + " terms:");

    for (int i = 0; i < num; i++) {
      System.out.print(obj.printFibo(i) + " ");
    }
  }
}