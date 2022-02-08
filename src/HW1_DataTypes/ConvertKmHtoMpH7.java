package HW1_DataTypes;

public class ConvertKmHtoMpH7 {
    public static void main(String[] args) {
        double kmh1 = 240;
        double mih1 = kmh1 / 1.609;
        System.out.println("For Kilometers/hour = " + kmh1
                + " Miles/Hour is: " + mih1);
//revers mi/h to km/h
        double mih2 = 150;
        double kmh2 = mih2 * 1.609;
        System.out.println("For Miles/hour = " + mih2
                + " Kilometers/hour is: " + kmh2);
    }
}
