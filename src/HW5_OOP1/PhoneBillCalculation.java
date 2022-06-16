package HW5_OOP1;

public class PhoneBillCalculation {
    public static void main(String[] Args) {
        PhoneBillInput client1 = new PhoneBillInput(200, 9.5,
                550, 58, 28, 30);
        System.out.println(client1.getBill());

    }
}

class PhoneBillInput {

    private double baseRate;
    private double usedTrafficGB;
    private double callDuration;
    private double callPrice;
    private double smsNumber;
    private double smsPrice;
    private double callsInZone1;
    private double callsInZone2;
    private double totalPhonePrice;

    public PhoneBillInput(double baseRate, double usedTrafficGB,
                          double callDuration, double smsNumber,
                          double callsInZone1, double callsInZone2) {
        this.baseRate = baseRate;
        this.usedTrafficGB = usedTrafficGB;
        this.callDuration = callDuration;
        this.smsNumber = smsNumber;
        this.callsInZone1 = callsInZone1;
        this.callsInZone2 = callsInZone2;
        setBill(baseRate, usedTrafficGB,
                callDuration, smsNumber,
                callsInZone1, callsInZone2);
    }


    public double internetPrice(double usedTrafficGB, double baseRate) {

        double inetPrice;
        if (usedTrafficGB >= 8) {
            inetPrice = baseRate + (usedTrafficGB - 8) * 100;
        } else {
            inetPrice = baseRate;
        }
        System.out.println("______________________");
        System.out.println("Internet price = " + inetPrice + " UAH");
        return inetPrice;
    }

    public double callPrice(double callDuration) {

        if (callDuration <= 500) {
            callPrice = callDuration * 0.5;
        }
        if (callDuration > 500) {
            callPrice = 500 * 0.5 + ((callDuration - 500) * 0.75);
        }
        System.out.println("Call price: " + callPrice + " UAH");
        return callPrice;
    }

    public double smsPrice(double smsNumber) {

        if (smsNumber > 50) {
            smsPrice = (smsNumber - 50) * 1.5 + 50;
        }
        if (smsNumber <= 50) {
            smsPrice = smsNumber * 1;
        }

        System.out.println("SMS price: " + smsPrice + " UAH");
        return smsPrice;
    }

    public double foreignCallPrice1(double callsInZone1) {
        double foreign1CallPrice = 1.5 * callsInZone1;
        System.out.println("Foreign calls in 1 zone: " + foreign1CallPrice + " UAH");
        return foreign1CallPrice;
    }

    double foreignCallPrice2(double callsInZone2) {
        double foreign2CallPrice = 2 * callsInZone2;
        System.out.println("Foreign calls in 2 zone: " + foreign2CallPrice + " UAH");
        return foreign2CallPrice;
    }

    double totalBill(double baseRate, double usedTrafficGB,
                     double callDuration, double smsNumber,
                     double callsInZone1, double callsInZone2) {

        return (internetPrice(usedTrafficGB, baseRate) +
                callPrice(callDuration) + smsPrice(smsNumber) +
                foreignCallPrice1(callsInZone1) + foreignCallPrice2(callsInZone2)) * 1.07;
    }

    public void setBill(double baseRate, double usedTrafficGB,
                        double callDuration, double smsNumber,
                        double callsInZone1, double callsInZone2) {
        totalPhonePrice = totalBill(baseRate, usedTrafficGB, callDuration, smsNumber, callsInZone1, callsInZone2);

    }


    double getBill() {
        return totalPhonePrice;
    }

}
