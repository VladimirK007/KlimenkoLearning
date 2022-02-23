package HW3_LoopsArrays;

public class ArrayMin {

    public static void main(String[] args) {
        int[] myArray = {100, 23, 32};

        if ((myArray[0] < myArray[1]) && (myArray[0] < myArray[2])) {
            System.out.println(myArray[0] + " is the minimum value");
        }
        if ((myArray[1] < myArray[0]) && (myArray[1] < myArray[2])) {
            System.out.println(myArray[1] + " is the minimum value");
        }
        if ((myArray[2] < myArray[0]) && (myArray[2] < myArray[1])) {
            System.out.println(myArray[2] + " is the minimum value");
        }

    }

}
