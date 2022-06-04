package HW4_Methods;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        hR k1 = new hR();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter working hours: ");
        k1.h = scanner.nextInt();
        System.out.print("Enter rate: ");
        k1.rate = scanner.nextDouble();
        System.out.print("Enter experience: ");
        k1.exp = scanner.nextInt();
        System.out.print("Enter number of sales: ");
        k1.sN = scanner.nextInt();
        System.out.print("Enter amount of sales: ");
        k1.sA = scanner.nextInt();

        k1.hRate();
        k1.kRate();
        k1.sNBonus();
        k1.sABonus();
        k1.Total();

    }
}

class hR {
    int h;
    double rate;
    int exp;
    double k;
    int sN;
    double bonus1;
    int sA;
    double bonus;
    double total;
    double salary;

    public void hRate() {

        if (h > 160) {
            salary = (160 + (h - 160) * 1.5) * rate;

        } else salary = h * rate;
        System.out.println("The agent`s salary: " + salary + " USD");
    }


    public void kRate() {
        if (exp <= 2) {
            k = 1;
        }
        if ((exp > 2) && (exp <= 4)) {
            k = 1.2;
        }
        if ((exp > 4) && (exp <= 6)) {
            k = 1.3;
        }
        if (exp > 6) {
            k = 1.4;
        }
        System.out.println("The agent`s ratio: " + k);
    }

    public void sNBonus() {
        if (sN > 20) {
            bonus1 = 250;
            System.out.println("Bonus depending on the Number of sales: " + bonus1);
        }
        if (sN < 10) {
            bonus1 = -150;
            System.out.println("Fine depending on the Number of sales: " + bonus1);
        }
        if ((sN >= 10) && (sN <= 20)) {
            bonus1 = 0;
            System.out.println("Bonus depending on the Number of sales: " + bonus1);
        }
    }

    public void sABonus() {
        if (sA > 15000) {
            bonus = 250;
            System.out.println("Bonus depending on the Amount of sales: " + bonus);
        }
        if (sA <= 15000) {
            bonus = 0;
            System.out.println("Bonus depending on the Amount of sales " + bonus);
        }
    }

    public void Total() {
        total = (salary * k) + bonus1 + bonus;
        System.out.println();
        System.out.println("---Your Salary: " + total + " USD---");
    }
}