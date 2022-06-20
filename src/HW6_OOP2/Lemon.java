package HW6_OOP2;

public class Lemon extends Fruit {

    public Lemon() {

        this.setCalories(setCalories(getCalories()));
    }

    public String peelLemon() {
        return "At this time the Lemon is peeling";
    }

    @Override
    public int setCalories(int calories) {
        calories = 29;
        return calories;
    }

    public String makeJuice() {
        return "Lemon juice is prepared";

    }

}
