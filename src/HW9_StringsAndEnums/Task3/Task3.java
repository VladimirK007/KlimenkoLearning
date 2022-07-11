package HW9_StringsAndEnums.Task3;


public class Task3 {

    public static void main(String[] args) {
        Repeat word = new Repeat();
        System.out.println(word.repeatRepeatRepeat("Java"));
        System.out.println(word.repeatRepeatRepeat("Chocolate"));
        System.out.println(word.repeatRepeatRepeat("abc"));

    }
}

class Repeat {

    public String repeatRepeatRepeat(String inputString) {

        String repeatWord;

        if (inputString.length() > 3) {
            repeatWord = inputString.substring(0, 3);
            return repeatWord + repeatWord + repeatWord;
        } else {
            repeatWord = inputString;
            return repeatWord;
        }

    }
}
