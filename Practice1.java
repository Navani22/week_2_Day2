package week_2_Day2;

import java.util.Scanner;

class Multiplication {
  int num;

  public void getnum(int num) {
    this.num = num;
  }

  public void printTable(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "*" + i + "=" + num * i);
    }
  }
}

public class Practice1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    Multiplication obj = new Multiplication();
    obj.getnum(num);
    obj.printTable(num);

  }
}
