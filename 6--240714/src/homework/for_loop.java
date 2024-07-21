package homework;

import java.util.Random;

public class for_loop {
    public static void main(String[] args) {
        int randomNumber = 0;
        Random rand = new Random();

        for (int i=0 ; i<20 ; i++) {
            randomNumber = rand.nextInt(1, 50);

            System.out.printf("%d - %d \n", i+1, randomNumber);

            if (randomNumber % 2 == 0) {
                System.out.print("Found first even number");
                break;
            }
        }
    }
}
