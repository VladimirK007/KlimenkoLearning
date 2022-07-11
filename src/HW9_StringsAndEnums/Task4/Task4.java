package HW9_StringsAndEnums.Task4;

public class Task4 {

    public static void main(String[] args) {
        BackAround word = new BackAround();
        System.out.println(word.backAround("cat"));
        System.out.println(word.backAround("Hello"));
        System.out.println(word.backAround("a"));

    }
}

class BackAround {

    public String backAround(String str) {
        char lastChar = str.charAt(str.length()-1);
        return lastChar + str + lastChar;

    }
}
