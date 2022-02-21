package HW2_ConditionalStatements;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");

        int a = scanner.nextInt();

        if (a > 1000) {
            System.out.println("The purchase amount including the 15% discount is: "
                    + (a * 0.85));
        }else {
            System.out.println("The discount is not available");
        }


    }


}


