package HW1_DataTypes;

public class Loan__Task9 {

    public boolean loan(int husbandAge, int wifeAge){
        return (husbandAge <=35) && (wifeAge<=35);

    }
}

class Parameters{
    public static void main(String[] args){
        Loan__Task9 l=new Loan__Task9();
        boolean result = l.loan(36,36);
        System.out.println(result);

    }
}