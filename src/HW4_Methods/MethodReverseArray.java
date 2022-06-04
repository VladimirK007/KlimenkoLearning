package HW4_Methods;

public class MethodReverseArray {

    public static void main(String[] args) {
        int[] Main_Array = {20, 19, 18, 4, 16, 15, 14, 4, 12, 11, 9};
        Reverse.Demo(Main_Array);

    }
}

class Reverse {
    static void Demo(int array[]) {

        System.out.println("Reverse array:");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}