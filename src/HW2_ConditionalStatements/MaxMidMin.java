package HW2_ConditionalStatements;

import java.util.Scanner;

public class MaxMidMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the value for c: ");
        int c = scanner.nextInt();

        if (a<c){
            System.out.println("a is min");
        }


    }



}
