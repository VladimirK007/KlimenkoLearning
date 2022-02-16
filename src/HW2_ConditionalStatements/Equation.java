package HW2_ConditionalStatements;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("This program solves the next equation: a*x+b=0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for а: ");
        double a = scanner.nextInt();

        if (a == 0) {
            System.out.println("a=0; can`t divide by Zero. Bye!");
        } else if (a != 0) {
            System.out.print("Enter the value for b: ");
            double b = scanner.nextInt();
            if (b == 0) {
                System.out.println("b=0; x=0. Bye!");
            } else {
                double x = -b / a;

                System.out.println("x = " + x);

            }
        }
    }
}
