package loops;

public class ForLoopInLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I: " + i);

            for (int j = 1 ; j <= 3 ; j++) {
                System.out.println("J: " + j);
            }
        }
    }
}
