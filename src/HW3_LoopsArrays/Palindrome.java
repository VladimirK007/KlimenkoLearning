package HW3_LoopsArrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String origString = in.nextLine();
        String reverseString = "";

        char[] characters = origString.toCharArray();

        for (int i = characters.length - 1; i >= 0; i--) {
            reverseString = reverseString + characters[i];
        }

        if (origString.equals(reverseString)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is NOT a palindrome");
            System.out.println("Reverse string " + reverseString);
        }
    }
}
