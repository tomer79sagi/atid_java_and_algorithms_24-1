package homework;

import java.util.Random;

public class for_loop_by_student {
    public static void main(String[] args) {

        for (int i=1 ; i<=20 ; i++) {
            // Another option
//            Math.random();

            Random rand = new Random();
            int num = rand.nextInt(50) + 1;
            System.out.println(i + " - " + num);

            if (num % 2 == 0) {
                System.out.println("I found an EVEN number");
                break;
            }
        }
    }
}
