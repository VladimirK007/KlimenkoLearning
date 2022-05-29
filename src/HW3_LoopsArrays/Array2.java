package HW3_LoopsArrays;

public class Array2 {

    public static void ins(int[] array) {
        int count = 0;
        int in = array[0];
        for (int i = 0; i < array.length; i++) {

            if ((array[i] % 2 == 0) & (array[i] % 3 != 0)) {
                in = array[i];
                System.out.println("The number is divided by 2 " +
                        "and is not divisible by 3: " + in);
                count++;

                continue;

            }
        } System.out.println("The number of values = " + count);
    }

    public static void main(String[] args) {
        int[] array1 = {22, 2, 32, 3, 3, 3};
        ins(array1);
    }
}
