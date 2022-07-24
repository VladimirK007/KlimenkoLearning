package HW9_StringsAndEnums.Task2;

public class StringInput {

    public static void main(String[] args) {
        Substring word = new Substring();
        word.withoutFirstAndLastChar("Hello");
        word.withoutFirstAndLastChar("abc");
        word.withoutFirstAndLastChar("a");

    }
}

class Substring {

    public String str;

    public String withoutFirstAndLastChar(String inputString) {
        try {
            str = inputString.substring(1, inputString.length() - 1);
            System.out.println(str);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Enter the String with more than 1 character!");
        }
        return str;
    }
}

