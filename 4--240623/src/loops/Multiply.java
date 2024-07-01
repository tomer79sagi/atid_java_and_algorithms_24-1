package loops;

public class Multiply {
    public static void main(String[] args) {

        // Goal, to reach 1*2*3*4*5
        int a = 1;
        int sumMultiply = 1;

        while (a < 6) {
            sumMultiply = sumMultiply * a;
            a++;
        }
    }
}
