package HW1_DataTypes;

public class ConvertMtoInches4 {
    public static void main(String[] args) {
        double meters1 = 10;
        double inches1 = meters1 * 39.37;
        System.out.println("For meters = " + meters1
                + " inches is: " + inches1);

        double inches2 = 393.7;
        double meters2 = inches2 / 39.37;
        System.out.println("For iches = " + inches2
                + " meters is: " + meters2);
    }

}
