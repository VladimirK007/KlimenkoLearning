package HW3_LoopsArrays;

public class ArrayMin {

    public static void mins(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);

    }

    public static void main(String[] args) {
        int[] array1 = {-3, 12, 6, 90, 12};
        mins(array1);
    }
}
