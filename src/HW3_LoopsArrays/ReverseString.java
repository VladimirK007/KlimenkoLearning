package HW3_LoopsArrays;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String origString = in.nextLine();
        String reverseString = String.valueOf(' ');

        char[] characters = origString.toCharArray();
        for (int i = characters.length - 1; i >= 0; i--) {
            reverseString = reverseString + characters[i];
        }
        System.out.println("Reverse String is: " + reverseString);
    }
}



