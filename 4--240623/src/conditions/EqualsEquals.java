package conditions;

public class EqualsEquals {
    public static void main(String[] args) {
        // הצבה
        int age = 45;

        // בדיקה - תנאי
        if (age == 45) {
            System.out.println("Age is 45");
        } else {
            System.out.println("Age is NOT 45");
        }

        boolean isSuperman = true;

        if (isSuperman == true) {
            System.out.println("Superman is true");
        } else {
            System.out.println("Superman is false");
        }

        String name = "Tomer Sagi";
        String anotherName = "Tomer Sagi";

        // Using 'String Pool', both Strings point to the same place
        if (name == anotherName) {
            System.out.println("TRUE 1");
        }

        String name2 = "Tomer Sagi";
        String anotherName2 = new String("Tomer Sagi"); // Force to NOT use String Pool

        if (name2 == anotherName2) {
            System.out.println("TRUE 2");
        }

        // Compare VALUES (not memory pointers)
        if (name2.equals(anotherName2)) {
            System.out.println("TRUE 3");
        }
    }
}
