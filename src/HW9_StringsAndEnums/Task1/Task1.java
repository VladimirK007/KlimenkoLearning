package HW9_StringsAndEnums.Task1;

public class Task1 {

    public static void main(String[] args) {
        UpperCase sentence = new UpperCase();
        sentence.afterFellInUpperCase("Get a modern feel with " +
                "a smudge-resistant only for" +
                "$2.50, you can finish now");

    }
}

class UpperCase {

    public String str;

    public String afterFellInUpperCase(String inputString) {
        str = inputString.substring(18, 23);
        System.out.println(str.toUpperCase());
        return str;
    }
}