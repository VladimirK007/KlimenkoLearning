package HW6_OOP2;

public class JuiceMarket {

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.displayInfo());
        System.out.println(" ");

        Banana banana = new Banana();
        Banana banana2 = banana;
        System.out.println(banana2.peelBanana());
        System.out.println("===" + banana2.makeJuice());
        System.out.println("It contains " + banana2.getCalories() + " calories");
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
