package HW1_DataTypes;

public class Purchase__Task11 {

    public boolean purchase(boolean mag1, boolean mag2) {
        return mag1 || mag2;

    }
}

class Parameters3 {
    public static void main(String[] args) {

        Purchase__Task11 p = new Purchase__Task11();
        boolean result = p.purchase(true, false);
        System.out.println(result);


    }

}
