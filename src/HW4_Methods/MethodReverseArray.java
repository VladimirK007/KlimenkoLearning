package HW4_Methods;

import java.util.Arrays;

public class MethodReverseArray {

    public static void main(String[] args) {
        int[] numbers = {20, 19, 18, 4, 16};
        reverse(numbers);
    }

    static void reverse(int[] input) {
        System.out.println("Original array: " + Arrays.toString(input));
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.print("Reversed array: " + Arrays.toString(input));
    }
}