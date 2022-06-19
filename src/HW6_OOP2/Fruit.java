package HW6_OOP2;

public class Fruit {

    public int calories;

    public Fruit() {


        this.calories = setCalories(calories);
    }

    public int setCalories(int calories) {

        return calories;
    }

    public int getCalories() {
        return calories;
    }

    public String makeJuice() {
        return "Juice is prepared";

    }

}
