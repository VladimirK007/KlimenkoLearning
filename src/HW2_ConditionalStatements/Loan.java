package HW2_ConditionalStatements;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the wife`s age: ");
        int wifeAge = input.nextInt();
        if (wifeAge>35){
            System.out.println("Mortgage loan is NOT approved by the bank");
        }
        else if ((wifeAge > 0) && (wifeAge <= 35)) {
            System.out.print("Enter the husband`s age: ");
            int husbandAge = input.nextInt();

         if  ((husbandAge > 0) && (husbandAge <= 35)) {
                System.out.println("Mortgage loan is approved by the bank");
            } else if (husbandAge>35){
                System.out.println("Mortgage loan is NOT approved by the bank");
            }
        }
    }
}



