package HW2_ConditionalStatements;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sales: ");
        int salesNumber = scanner.nextInt();

        if (salesNumber > 10) {
            System.out.println("The manager`s salary is 1250$");
        } else if ((salesNumber > 0) && (salesNumber <= 10)) {
            System.out.println("The manager`s salary is 1000$");
        } else {
            System.out.println("Manager's salary in doubt");
        }
    }
}
