package HW6_OOP2;

public class JuiceMarket {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Fruit apple2 = new Apple();
        System.out.println(apple2.makeJuice());
        System.out.println(apple1.displayInfo());
        System.out.println(" ");

        Fruit banana1 = new Banana();
        Banana banana = new Banana();
        System.out.println(banana.peelBanana());
        System.out.println(banana.makeJuice());
        System.out.println("It contains " + banana1.getCalories() + " calories");
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
