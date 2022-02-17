package HW2_ConditionalStatements;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sales: ");
        int salesNumber = scanner.nextInt();

        if (salesNumber >= 10) {
            System.out.println("Manager earns a bonus");
        } else {
            int salesLeft = 10 - salesNumber;
            System.out.println("The manager has to make "
                    + salesLeft + " sales to get the bonus ");
        }
    }
}
