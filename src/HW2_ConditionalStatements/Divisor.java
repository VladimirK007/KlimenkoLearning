package HW2_ConditionalStatements;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value for b: ");
        double b = scanner.nextDouble();
        double c = b % a;

        if (c == 0) {
            System.out.println("YES, a is a divisor for b ");
        } else {
            System.out.println("NO, a is not a divisor for b ");
        }
    }
}
