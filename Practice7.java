package week_2_Day2;

import java.util.Scanner;

class Pattern {
    public static void printPattern(int num) {
        if (num <= 0) {
            return;
        }

        printNum(num);
        System.out.println();

        printPattern(num - 1);
    }

    private static void printNum(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("*");
        printNum(count - 1);
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        Pattern.printPattern(num);

        sc.close();
    }
}
