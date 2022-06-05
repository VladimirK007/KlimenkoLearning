package HW4_Methods;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Phone k1 = new Phone();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of GB: ");
        k1.gb = scanner.nextInt();
        System.out.print("Enter number of calls (min): ");
        k1.calls = scanner.nextDouble();
        System.out.print("Enter number of sms: ");
        k1.sms = scanner.nextDouble();
        System.out.print("Enter number of calls in 1 zone: ");
        k1.callZone1 = scanner.nextDouble();
        System.out.print("Enter number of calls in 2 zone: ");
        k1.callZone2 = scanner.nextDouble();

        k1.P1();
        k1.P2();
        k1.P3();
        k1.P4();
        k1.P5();
        k1.P6();

    }
}

class Phone {
    int gb;
    double inetPrice;
    double calls;
    double callPrice;
    double sms;
    double smsPrice;
    double callZone1;
    double callZone2;
    double fC1;
    double fC2;
    double total;

    void P1() {
        if (gb >= 8) {
            inetPrice = (gb - 8) * 100;
        } else inetPrice = 0;
        System.out.println("Internet price = " + inetPrice + " UAH");
    }

    void P2() {
        if (calls <= 500) {
            callPrice = calls * 0.5;
        }
        if (calls > 500) {
            callPrice = 500 * 0.5 + ((calls - 500) * 0.75);
        }
        System.out.println("Call price: " + callPrice + " UAH");
    }

    void P3() {
        if (sms > 50) {
            smsPrice = (sms - 50) * 1.5 + 50;
        }
        if (sms <= 50) {
            smsPrice = sms * 1;
        }

        System.out.println("SMS price: " + smsPrice + " UAH");

    }

    void P4() {
        fC1 = 1.5 * callZone1;
        System.out.println("Foreign calls in 1 zone: " + fC1 + " UAH");

    }

    void P5() {
        fC2 = 2 * callZone2;
        System.out.println("Foreign calls in 1 zone: " + fC2 + " UAH");
    }

    void P6() {

        total = (inetPrice + callPrice + smsPrice + fC1 + fC2) * 1.07;
        System.out.println(" ");

        System.out.println("---Total Phone Bill: " + total + " UAH---");
    }
}


