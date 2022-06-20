package HW6_OOP2;

public class Orange extends Fruit {
    public Orange() {

        this.setCalories(setCalories(getCalories()));
    }

    public String peelOrange() {
        return "At this time the Orange is peeling";
    }

    @Override
    public int setCalories(int calories) {
        calories = 47;
        return calories;
    }

    public String makeJuice() {
        return "Orange juice is prepared";

    }

}
