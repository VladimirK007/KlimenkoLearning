package HW8_Exceptions.Sum;

import java.util.*;

public class Sum5 {
    public static void main(String[] args) {
        System.out.println("The sum is: " + sumCalc());
    }

    public static double sumCalc() {
        double sum = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter the number: ");
            try {
                Scanner input = new Scanner(System.in);
                sum = sum + input.nextDouble();
            } catch (InputMismatchException e) {
                i--;
                System.out.println("You have entered invalid value. Try again");
            }
        }

        return sum;
    }
}