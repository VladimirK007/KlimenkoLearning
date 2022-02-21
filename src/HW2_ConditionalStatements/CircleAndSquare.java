package HW2_ConditionalStatements;

import java.util.Scanner;

public class CircleAndSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квадрата: ");
        double sSquare = scanner.nextDouble();

        System.out.println("Введите площадь круга: ");
        double sCircle = scanner.nextDouble();

        double angle = Math.sqrt(sSquare) / 2;
        double radius  = Math.sqrt(sCircle/ 3.14);
        if (radius <= angle) {
            System.out.println("Круг поместится в квадрате " + "A= " + angle + " R= " + radius);
        }else {
            System.out.println("Квадрат поместится в круге " + "A= " + angle + " R= " + radius );
        }


    }

}
