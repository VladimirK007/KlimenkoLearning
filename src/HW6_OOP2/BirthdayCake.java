package HW6_OOP2;

public class BirthdayCake extends Cake {

    public int candles;

    public BirthdayCake() {
        this.candles = setCandles(candles);
        this.price = setPrice(price);

    }

    public int getCandles() {
        return candles;
    }

    public int setCandles(int candles) {
        this.candles = candles;
        return 12;
    }

      public String setTaste(String taste) {
        this.taste = taste;
        return "Banana";
    }

    public double setPrice(double price) {
        this.price = price;
        return 120.15;
    }

}
