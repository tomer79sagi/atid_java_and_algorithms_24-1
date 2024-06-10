import java.util.Random;

public class RandomFloat {
    public static void main(String[] args) {
        Random random = new Random();
        double randomNumber = 0 + (100 - 0) * random.nextDouble();

        // Print the random number
        System.out.println("Random number between 0 and 100 (inclusive): " + randomNumber);
    }
}