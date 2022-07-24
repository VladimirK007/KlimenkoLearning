package HW9_StringsAndEnums.Task1;

public class StringInput {

    public static void main(String[] args) {
        UpperCase sentence = new UpperCase();
        System.out.println(sentence.afterFellInUpperCase("Get a modern feel with " +
                "a smudge-resistant only for" +
                "$2.50, you can finish now"));

    }
}

class UpperCase {

    public String afterFellInUpperCase(String inputString) {
        String[] list = inputString.split(" ");
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("feel")) {
                return list[i + 1].toUpperCase();
            }
        }
        return inputString;
    }
}

