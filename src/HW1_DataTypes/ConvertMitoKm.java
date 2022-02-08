package HW1_DataTypes;

public class ConvertMitoKm {
    public static void main(String[] args) {
        double mile1 = 100;
        double km1 = mile1 * 1.609;
        System.out.println("For miles = " + mile1
                + " kilometers is " + km1);
// revers kilometers to miles
        double km2 = 160.9;
        double mile2 = km2 / 1.609;
        System.out.println("For kilometers = " + km2
                + " miles is " + mile2);

    }

}
