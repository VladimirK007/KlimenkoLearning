package HW6_OOP2;

public class Lemon extends Fruit {

    public Lemon() {

        this.calories = setCalories(calories);
    }

    public String peelLemon() {
        return "At this time the Lemon is peeling";
    }

    @Override
    public int setCalories(int calories) {
        calories = 29;
        super.setCalories(calories);
        return calories;
    }

    public String makeJuice() {
        return "Lemon juice is prepared";

    }

}
