package functions;

public class ClassExercises {
    public static void main(String[] args) {
        // Exercise 3
        int result1 = max3Params(7, 19, 5);
        int result2 = max3Params(11, 5, 3);
        int result3 = max3Params(9, 18, 25);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // Exercise 5 - Even numbers
        System.out.println(isEven(7));
        System.out.println(isEven(18));
        System.out.println(isEven(26));

        // Exercise 6 - int[] average
        int[] arrNums = {7, 2, 55, 23, 44, 11, 9};
        System.out.println("Array Average: " + arrayAverage(arrNums));
    }

    public static float arrayAverage(int[] numArray) {
        float sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }

        return sum / numArray.length;
    }

    // בדיקה האם מספר הוא זוגי או אי-זוגי (מקוצר)
    public static boolean isEvenShort(int num) {
        return num % 2 == 0;
    }

    // בדיקה האם מספר הוא זוגי או אי-זוגי
    public static boolean isEven(int num) {
        int mod = num % 2;
        boolean isEven;

        if (mod == 0) {
            isEven = true;
        } else {
            isEven = false;
        }

        return isEven;
    }

    public static int max3Params(int a, int b, int c) {
        if (a >= b) {
            return max2Params(a, c);
        } else { // a < b
            return max2Params(b, c);
        }
    }

    public static int max2Params(int a, int b) {
        if (a >= b) { // a is max
            return a;
        } else { // a < b
            return b; // b is max
        }
    }
}
