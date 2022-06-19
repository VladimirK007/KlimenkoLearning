package HW6_OOP2;

public class Apple extends Fruit {

    public Apple() {

        this.calories = setCalories(calories);
    }

    public String removeSeeds() {
        return "At this time, the seeds are removing from the apples";
    }

    @Override
    public int setCalories(int calories) {
        calories = 52;
        super.setCalories(calories);
        return calories;
    }

    public String makeJuice() {
        return "Apple juice is prepared";
    }

    public String displayInfo(){
       return removeSeeds() + ". " + makeJuice() + ". It contains " +
               getCalories() + " calories";

    }

}

