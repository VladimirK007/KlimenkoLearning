package HW6_OOP2;

public class Cake {

    public String taste;
    public double price;

    public Cake() {
        this.taste = setTaste(taste);
        this.price = setPrice(price);
    }

    public String getTaste() {
        return taste;
    }

    public String setTaste(String taste) {
        this.taste = taste;
        return "Vanilla";
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        price = 120;
        this.price = price;
        return price;
    }


}
