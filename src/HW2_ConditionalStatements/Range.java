package HW2_ConditionalStatements;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int input = s.nextInt();

        if ((input >= -5) && (input <=3)) {
            System.out.println("The entered value belongs to the -5;3 range ");
        } else {
            System.out.println("The entered value does not belong to the -5;3 range ");
        }

    }

}
