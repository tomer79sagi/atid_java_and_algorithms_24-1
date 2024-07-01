package _prep.loops;

public class Fibonacci {
    public static void main(String[] args) {
        int maxIteration = 9;
        int counter = 0;

        int prevCounter = 0;
        int prevPrevCounter = 0;
        int fibValue = 0;

        while (counter < maxIteration) {
            if (counter < 2) {
                fibValue = 1;
                prevCounter = 1;
            }

            System.out.println(fibValue);
            fibValue = prevCounter + prevPrevCounter;

            prevPrevCounter = prevCounter;
            prevCounter = fibValue;
            counter++;
        }
    }
}
