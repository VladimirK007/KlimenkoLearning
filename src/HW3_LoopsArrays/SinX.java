package HW3_LoopsArrays;

public class SinX {
    public static void main(String[] args) {

        int[] degrees = new int[37];

        for (int i = 0; i < degrees.length; i++) {
            degrees[i] = (i * 10);

        }
        for (int i = 0; i < degrees.length; i++) {
            double rad = degrees[i] * Math.PI / 180;
            double sin = Math.sin(rad);
            System.out.println("sin " + degrees[i] + "o" + " = " + sin);
        }
    }
}
