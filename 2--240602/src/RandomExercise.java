public class RandomExercise {
    public static void main(String[] args) {
        // Random number between 0..1 (not including 1)
        float random = (float)Math.random();

        // Random number between 0..3 (not including 3)
        float random1 = (float)Math.random() * 3; // 0 -> 2.9999

        // Random number between 2..5 (not including 5)
        float random2 = (float)Math.random() * 3 + 2; // 2 -> 4.999999

        // Random number between 2..5 (including 5)
        int random3 = (int)Math.round(Math.random() * 3 + 2); // 2 -> 5

        System.out.println("Random number (0..3 not including): " + random1);
        System.out.println("Random number (2..5 not including): " + random2);
        System.out.println("Random number (2..5 including): " + random3);
    }
}
