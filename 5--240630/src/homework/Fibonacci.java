package homework;

public class Fibonacci {
    public static void main(String[] args) {
        // A) 1, 1, 2

//        int a = 1;
//        int b = 1;
//        int c = a + b;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        // A) 1, 1, 2*, 3*
        int a = 1;
        int b = 1;
        int c;
        int maxIterations = 8;

        System.out.println(a);
        System.out.println(b);

        while (maxIterations > 0) {
            c = a + b;
            System.out.println(c);

            a = b;
            b = c;

            maxIterations--;
        }
    }
}
