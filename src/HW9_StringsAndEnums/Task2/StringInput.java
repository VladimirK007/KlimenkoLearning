package HW9_StringsAndEnums.Task2;

public class StringInput {


    public static void main(String[] args) {
        Substring word = new Substring();
        word.withoutFirstAndLastChar("Hello");
        word.withoutFirstAndLastChar("abc");


    }
}

class Substring {

    public String str;

    public String withoutFirstAndLastChar(String inputString) {

        str = inputString.substring(1, inputString.length() - 1);
        System.out.println(str);
        return str;

    }

}
