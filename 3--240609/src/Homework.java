public class Homework {
    public static void main(String[] args) {
        // Random from 5 to 10 inclusive
        // 0..1 (exclude) * 6 --> 0..5.999 + 5 --> 5..10.999
        int randomNumber = (int)(Math.random() * 6 + 5);
        System.out.println(randomNumber);

//        System.out.println(randomNumber);
    }
}
