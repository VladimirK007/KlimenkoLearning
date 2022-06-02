package HW3_LoopsArrays;

public class SinX {
    public static void main(String[] args) {

       int degrees;

        for (int i = 0; i <=360; i+=10) {

            System.out.println(Math.sin(Math.toRadians(i)));
        }
    }
}
