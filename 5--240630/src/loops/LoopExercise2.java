package loops;

import java.util.Random;

public class LoopExercise2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        for (int i = 0 ; i < 6 ; i++) {
            int rndNumber = rnd.nextInt(50) + 1;

            // Check if it is ODD or EVEN
            if (rndNumber % 2 == 0) {
                System.out.println(rndNumber + " | EVEN");
            } else {
                System.out.println(rndNumber + " | ODD");
            }
        }
    }
}
