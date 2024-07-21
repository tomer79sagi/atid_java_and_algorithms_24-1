package arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        String[][][] students = new String[3][][];

        // הגדר מימד שני
        // מערך של 2 איברים
        // איבר 1 במימד 2 - פרטים אישיים, כרגע רק שם
        // איבר 2 במימד 2 - רשימת המקצועות
        students[0] = new String[2][]; // מערך רק עם 2 איברים
        students[0][0] = new String[]{"Michel"};
        students[0][1] = new String[]{"Math", "Biology", "Physics"}; // Define array of size 3
        students[0][0][0] = "Michel V2";
        students[0][1][1] = "Vehicle Maintenance"; // "Biology" -> "Vehicle Maintenance"
        students[0][1][2] = "Bird Watching"; // "Physics" -> "Bird Watching"
        students[0][1][3] = "Programming"; // Exception!! -> Index out of bounds

        students[1] = new String[2][]; // מערך רק עם 2 איברים
        students[1][0] = new String[]{"Igor"};
        students[1][1] = new String[]{"Math", "Biology", "Physics"};

        // מעבר על הסטודנטים
        for (int i=0; i<students.length; i++) {

            // מעבר על המימד השני (2 איברים בלבד)
            for (int j=0; j<students[i].length; j++) {
                // מעבר על מימד שלישי
                // רק במימד האחרון יש נתונים
                for (int k=0; k<students[i][j].length; k++) {
                    System.out.println(students[i][j][k]);
                }
            }
        }

    }
}
