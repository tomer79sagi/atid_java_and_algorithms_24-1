package loops;

import java.util.Random;

public class LoopExercise {
    public static void main(String[] args) {

        Random rnd = new Random();
        for (int i = 0 ; i < 5 ; i++) {
            // 1. Random
            // 2. Math.Random

            int rndNumber = rnd.nextInt(100) + 1;
            System.out.println(rndNumber);
        }
    }
}
