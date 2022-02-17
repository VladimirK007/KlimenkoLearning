package HW2_ConditionalStatements;

import java.util.Scanner;

public class Fingers {

    public static int finger(int fingerNumber) {

        switch (fingerNumber) {
            case 1 -> System.out.println("Это большой палец");
            case 2 -> System.out.println("Это указательный палец");
            case 3 -> System.out.println("Это средний палец");
            case 4 -> System.out.println("Это безымянный палец");
            case 5 -> System.out.println("Это мизинец");
            default -> System.out.println("Данные введены неверно!!!");
        }
        return fingerNumber;
    }
}

class Res {
    public static void main(String[] args) {

        Fingers result = new Fingers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер пальца: ");

        int input = scanner.nextInt();
        int output = result.finger(input);
        System.out.println(output);

    }
}

