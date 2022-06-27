package HW6_OOP2.Cakes;

public class TasteTester {

    public static void main(String[] args) {

        BirthdayCake cake1 = new BirthdayCake();

        BirthdayCake cake2 = cake1;
        System.out.println("The number of candles in 2nd cake is: " + cake2.getCandles());

        BirthdayCake cake3 = cake1;
        System.out.println("The price of the 3rd cake is: " + cake3.getPrice());

        BirthdayCake cake4 = cake1;
        System.out.println("The taste of the 4th cake is: " + cake4.getTaste());
        System.out.println(" ");

        WeddingCake wCake = new WeddingCake();
        WeddingCake wCake4Rose = wCake;
        System.out.println("The number of the tiers in a Wedding 4 Rose Cake: " + wCake4Rose.getTiers());
        System.out.println("The price of the Wedding 4 Rose Cake is: " + wCake4Rose.getPrice());
        System.out.println("The taste of the Wedding 4 Rose Cake is: " + wCake4Rose.getTaste());

    }
}
