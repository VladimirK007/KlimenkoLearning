package HW2_ConditionalStatements;

import java.util.Scanner;

public class MaxMidMin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter tha value for a: ");
        int a = s.nextInt();

        System.out.print("Enter tha value for b: ");
        int b = s.nextInt();

        System.out.print("Enter tha value for c: ");
        int c = s.nextInt();

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
        else {
            System.out.println("You entered invalid data. Please try again!");
        }

    }

}