package HW4_Methods;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Phone costOfTelephoneCalls = new Phone();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of used gigabytes of traffic: ");
        costOfTelephoneCalls.usedTrafficGB = scanner.nextInt();
        System.out.print("Enter number of calls (min): ");
        costOfTelephoneCalls.callDuration = scanner.nextDouble();
        System.out.print("Enter number of sms: ");
        costOfTelephoneCalls.smsNumber = scanner.nextDouble();
        System.out.print("Enter number of calls (min) in 1 zone: ");
        costOfTelephoneCalls.callsInZone1 = scanner.nextDouble();
        System.out.print("Enter number of calls (min) in 2 zone: ");
        costOfTelephoneCalls.callsInZone2 = scanner.nextDouble();

        costOfTelephoneCalls.internetPrice();
        costOfTelephoneCalls.callPrice();
        costOfTelephoneCalls.smsPrice();
        costOfTelephoneCalls.foreignCallPrice1();
        costOfTelephoneCalls.foreignCallPrice2();
        costOfTelephoneCalls.totalPhoneBill();

    }
}

class Phone {
    int usedTrafficGB;
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

    void internetPrice() {
        if (usedTrafficGB >= 8) {
            inetPrice = (usedTrafficGB - 8) * 100;
        } else inetPrice = 0;
        System.out.println("Internet price = " + inetPrice + " UAH");
    }

    void callPrice() {
        if (callDuration <= 500) {
            callPrice = callDuration * 0.5;
        }
        if (callDuration > 500) {
            callPrice = 500 * 0.5 + ((callDuration - 500) * 0.75);
        }
        System.out.println("Call price: " + callPrice + " UAH");
    }

    void smsPrice() {
        if (smsNumber > 50) {
            smsPrice = (smsNumber - 50) * 1.5 + 50;
        }
        if (smsNumber <= 50) {
            smsPrice = smsNumber * 1;
        }

        System.out.println("SMS price: " + smsPrice + " UAH");

    }

    void foreignCallPrice1() {
        foreign1CallPrice = 1.5 * callsInZone1;
        System.out.println("Foreign calls in 1 zone: " + foreign1CallPrice + " UAH");

    }

    void foreignCallPrice2() {
        foreign2CallPrice = 2 * callsInZone2;
        System.out.println("Foreign calls in 2 zone: " + foreign2CallPrice + " UAH");
    }

    void totalPhoneBill() {

        totalPhonePrice = (inetPrice + callPrice + smsPrice + foreign1CallPrice + foreign2CallPrice) * 1.07;
        System.out.println(" ");

        System.out.println("---Total Phone Bill: " + totalPhonePrice + " UAH---");
    }
}


