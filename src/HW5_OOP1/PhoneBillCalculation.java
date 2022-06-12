package HW5_OOP1;

public class PhoneBillCalculation {
    public static void main(String[] Args) {
        PhoneBillInput client1 = new PhoneBillInput(200,9.5,
                550,58,28,30);
        client1.getPhoneBill();

    }
}

class PhoneBillInput {

    double baseRate;
    double usedTrafficGB;
    double inetPrice;
    double callDuration;
    double callPrice;
    double smsNumber;
    double smsPrice;
    double callsInZone1;
    double callsInZone2;
    double foreign1CallPrice;
    double foreign2CallPrice;
    double totalPhonePrice;

    public PhoneBillInput(double baseRate, double usedTrafficGB,
                          double callDuration, double smsNumber,
                          double callsInZone1, double callsInZone2) {
        this.baseRate = baseRate;
        this.usedTrafficGB = usedTrafficGB;
        this.callDuration = callDuration;
        this.smsNumber = smsNumber;
        this.callsInZone1 = callsInZone1;
        this.callsInZone2 = callsInZone2;
    }

    public double getPhoneBill() {

        if (usedTrafficGB >= 8) {
            inetPrice = baseRate + (usedTrafficGB - 8) * 100;
        } else {
            inetPrice = baseRate;
        }
        System.out.println("______________________");
        System.out.println("Internet price = " + inetPrice + " UAH");


        if (callDuration <= 500) {
            callPrice = callDuration * 0.5;
        }
        if (callDuration > 500) {
            callPrice = 500 * 0.5 + ((callDuration - 500) * 0.75);
        }
        System.out.println("Call price: " + callPrice + " UAH");


        if (smsNumber > 50) {
            smsPrice = (smsNumber - 50) * 1.5 + 50;
        }
        if (smsNumber <= 50) {
            smsPrice = smsNumber * 1;
        }

        System.out.println("SMS price: " + smsPrice + " UAH");


        foreign1CallPrice = 1.5 * callsInZone1;
        System.out.println("Foreign calls in 1 zone: " + foreign1CallPrice + " UAH");


        foreign2CallPrice = 2 * callsInZone2;
        System.out.println("Foreign calls in 2 zone: " + foreign2CallPrice + " UAH");


        totalPhonePrice = (inetPrice + callPrice + smsPrice + foreign1CallPrice + foreign2CallPrice) * 1.07;
        System.out.println("______________________ ");
        System.out.println("Total Phone Bill: " + totalPhonePrice + " UAH");
        return totalPhonePrice;
    }
}
