package week_2_Day2;

import java.util.Scanner;

public class Practice8 {
    public static void printPattern(int num) {
        if (num <= 0) {
            return;
        }

        printPattern(num - 1); 
        printStars(num); 
        System.out.println(); 
    }

    private static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("*");
        printStars(count - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num = sc.nextInt();
        sc.close();

        printPattern(num);
    }
}
