package HW3_LoopsArrays;

public class ArrayReverse {
    public static void ins(int[] array) {

        int[] marks2 = new int[array.length];
        System.out.print("Reversed Array: ");
        for (int i = array.length - 1; i > 0; ) {
            for (int j = 0; j < array.length; j++) {
                marks2[j] = array[i];
                i--;
                System.out.print(marks2[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {22, 2, 32, 3, 3, 3};
        ins(array1);
    }
}
