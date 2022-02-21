package HW2_ConditionalStatements;

import java.util.Scanner;

public class MaxMidMin {

    public int maximin(int a, int b, int c) {


        if ((a < b) && (a < c)) {
            System.out.println("The value a = " + a + " is min");
        }
        if ((a > b) && (a < c) || ((a < b) && (a > c))) {
            System.out.println("The value a = " + a + " is mid");
        }
        if ((a > b) && (a > c)) {
            System.out.println("The value a = " + a + " is max");
        }

        if ((b < a) && (b < c)) {
            System.out.println("The value b = " + b + " is min");
        }
        if ((b > a) && (b < c) || ((b < a) && (b > c))) {
            System.out.println("The value b = " + b + " is mid");
        }
        if ((b > a) && (b > c)) {
            System.out.println("The value b = " + b + " is max");
        }

        if ((c < a) && (c < b)) {
            System.out.println("The value c = " + c + " is min");
        }
        if ((c > a) && (c < b) || ((c < a) && (c > b))) {
            System.out.println("The value c = " + c + " is mid");
        }
        if ((c > a) && (c > b)) {
            System.out.println("The value c = " + c + " is max");
        }
        if ((a == b) && (a == c)) {
            System.out.println("The entered values are equal");
        }
        return a;
    }

    public static void main(String[] args) {

        MaxMidMin result = new MaxMidMin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        int output = result.maximin(a, b, c);

    }
}