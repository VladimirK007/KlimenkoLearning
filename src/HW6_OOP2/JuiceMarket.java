package HW6_OOP2;

public class JuiceMarket {

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.displayInfo());
        System.out.println(" ");

        Banana banana = new Banana();
        System.out.println(banana.peelBanana());
        System.out.println("===" + banana.makeJuice());
        System.out.println("It contains " + banana.getCalories() + " calories");
        System.out.println(" ");

        Orange orange = new Orange();
        System.out.println(orange.peelOrange());
        System.out.println("===" + orange.makeJuice());
        System.out.println("It contains " + orange.getCalories() + " calories");
        System.out.println(" ");

        Lemon lemon = new Lemon();
        System.out.println(lemon.peelLemon());
        System.out.println("===" + lemon.makeJuice());
        System.out.println("It contains " + lemon.getCalories() + " calories");

    }

}
