package HW3_LoopsArrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int array[] = new int[] { 10,20,30,50,70 };
        System.out.println("Reverse array:");
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
