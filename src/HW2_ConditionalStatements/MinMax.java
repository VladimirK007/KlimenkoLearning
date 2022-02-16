package HW2_ConditionalStatements;

public class MinMax {
    public static void main(String[] args) {
        int numA = 10;
        int numB = 13;

        if (numA > numB) {
            System.out.println("The number " + numA + " has the greatest value");
        } else if (numA == numB) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The number " + numB + " has the greatest value");
        }

    }

}
