package functions;

public class VoidNoParamFunction {
    // פונקציה שמדפיסה סכום של 5 + 8
    // קלט: ללא
    // פלט: ללא
    public static void printSum() {
        System.out.println("Sum: " + (5 + 8));
    }

    // פונקציה שמדפיסה סכום של 5 + 8
    // קלט: 2 ארגומנטים - מספרים שלמים, כדי לבצע חישוב
    // פלט: ללא
    public static void printSum2(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // פונקציה שמדפיסה סכום של 5 + 8
    // קלט: 2 ארגומנטים - מספרים שלמים, כדי לבצע חישוב
    // פלט: מחזירה את הסכום כסוג אינטגר
    public static int printSum3(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Starting the program.");

        printSum();
        printSum2(1, 2);
        printSum2(4, 5);
        printSum2(555, 666);

        int sum = printSum3(124, 44);
        System.out.println("Sum3: " + sum);
    }
}
