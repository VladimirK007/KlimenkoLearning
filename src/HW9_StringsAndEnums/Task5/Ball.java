package HW9_StringsAndEnums.Task5;

public enum Ball {
    FOOTBALL(12, "Football", 120, "Leather"),
    BASKETBALL(14, "Basketball", 110, "Rubber"),
    VOLLEYBALL(11, "Volleyball", 100, "Leather"),
    TENNISBALL(3, "Tennis", 50, "Leather"),
    BASEBALL(7.6, "Baseball", 40, "Rubber");

    private final double size;
    private final String sport;
    private final double price;
    private final String material;


    Ball(double size, String sport, double price, String material) {

        this.size = size;
        this.sport = sport;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public String getSport() {
        return sport;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "Product details: size= "
                + size + "cm. Sport type= "
                + sport + "price= "
                + price + "USD Material= "
                + material;

    }

}
