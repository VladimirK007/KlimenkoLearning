package HW3_LoopsArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        int array[] = new int[5];
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            array[i] = die;
            System.out.println(" ");
            System.out.println("Result after the " + (i + 1) + " roll: " + array[i]);
            sum = array[i] + sum;
            if (sum == 20) {
                System.out.println("---You have moved to the 20 field---");
                System.out.println("***Congratulations! You Won!***");
                break;
            }
            if (sum < 20) {
                System.out.println(" ");
                System.out.println("---You have moved to the " + sum +
                        " field, and you have " + (20 - sum) + " points to win!");
            }
            if (sum > 20) {
                System.out.println("***You have over the 20 points, you lose!!!***");
                break;
            }
        }
        System.out.println(" ");
        if (sum < 20) {
            System.out.println("***You have " + sum + " points, and you lose!***");
        }
    }
}

