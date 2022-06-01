package HW4_Methods;

public class MethodReverseArray {

    public static void main(String[] args) {
        int[] Main_Array = {20, 19, 18, 4, 16, 15, 14, 4, 12, 11, 9};
        int[] Second_Array = {12, 3, 5, 9};
        int[] Third_Array = {45, 894, 23, 243, 34};
        Reverse.Demo(Main_Array);
        System.out.println(" ");
        Reverse.Demo(Second_Array);
        System.out.println(" ");
        Reverse.Demo(Third_Array);

    }
}

class Reverse {
    static void Demo(int A[]) {
        int[] array1 = new int[A.length];
        System.out.print("Reversed Array: ");
        for (int i = A.length - 1; i > 0; ) {
            for (int j = 0; j < A.length; j++) {
                array1[j] = A[i];
                i--;
                System.out.print(array1[j] + " ");

            }
        }
    }
}