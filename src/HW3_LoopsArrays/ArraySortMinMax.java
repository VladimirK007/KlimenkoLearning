package HW3_LoopsArrays;

import java.util.Scanner;

public class ArraySortMinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Insert array elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int counter;

        do {
            counter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }

            }

        }

        while (counter > 0);
        System.out.println(' ');
        for (int numbers : array) {
            System.out.print(numbers + " ");

        }
    }
}
