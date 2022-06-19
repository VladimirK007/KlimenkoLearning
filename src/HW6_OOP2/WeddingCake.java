package HW6_OOP2;

public class WeddingCake extends Cake {
    public int tiers;

    public WeddingCake(){
        this.tiers = setTiers(tiers);
        this.price = setPrice(price);
        this.taste= setTaste(taste);

    }

    public int getTiers() {
        return tiers;
    }

    public int setTiers(int tiers) {
        this.tiers = tiers;
        return 8;
    }

    public double setPrice(double price) {
        this.price = price;
        return 850;
    }

    public String setTaste(String taste) {
        this.taste = taste;
        return "Wildberry Mix";
    }


}
