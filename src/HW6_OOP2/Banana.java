package HW6_OOP2;

public class Banana extends Fruit {

    public Banana() {

        this.calories = setCalories(calories);
    }

    public String peelBanana() {
        return "At this time the Banana is peeling";
    }

    @Override
    public int setCalories(int calories) {
        calories = 89;
        super.setCalories(calories);
        return calories;
    }

    public String makeJuice() {
        return "Banana juice is prepared";

    }

}
