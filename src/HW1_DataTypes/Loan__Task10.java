package HW1_DataTypes;

public class Loan__Task10 {

    public boolean loan(int income) {
        return (income > 20000) && (income < 50000);

    }

}

class Parameters2 {
    public static void main(String[] args) {


        Loan__Task10 l = new Loan__Task10();
        boolean result = l.loan(50001);
        System.out.println(result);

    }
}