package HW2_ConditionalStatements;

import java.util.Scanner;

public class MaxMidMin {

    static int aVar(int a, int b, int c) {


        if ((a < b) && (a < c)) {
            System.out.println("a is min");
        } else if ((a > b) && (a < c) || ((a < b) && (a > c))) {
            System.out.println("a is mid");
        } else if ((a > b) && (a > c)) {
            System.out.println("a is max");
        }
        return a;
    }

    static int bVar(int a, int b, int c) {
        if ((b < a) && (b < c)) {
            System.out.println("b is min");
        } else if ((b > a) && (b < c) || ((b < a) && (b > c))) {
            System.out.println("b is mid");
        } else if ((b > a) && (b > c)) {
            System.out.println("b is max");
        }
        return b;
    }

    static int cVar(int a, int b, int c) {
        if ((c < a) && (c < b)) {
            System.out.println("c is min");
        } else if ((c > a) && (c < b) || ((c < a) && (c > b))) {
            System.out.println("c is mid");
        } else if ((c > a) && (c > b)) {
            System.out.println("c is max");
        }
        return c;
    }


    public static void main(String[] args) {
        MaxMidMin result = new MaxMidMin();

        int a1 = result.aVar(100, 15, 200);
        int b1 = result.bVar(100, 15, 200);
        int c1 = result.cVar(100, 15, 200);
    }
}