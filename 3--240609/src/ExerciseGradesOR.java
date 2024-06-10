public class ExerciseGradesOR {
    public static void main(String[] args) {

        // 1. Create random grade
        int grade = (int)(Math.random() * 121);
        System.out.println("Grade: " + grade);

        // 2. Check boundaries
        if (grade > 100 || grade < 0) {
            System.out.println("Out of range");
        // 3. Check core logic
        } else { // From here, we know that the grade is in range
            if (grade <= 55) {
                System.out.println("מספיק");
            } else if (grade <= 65) {
                System.out.println("כמעט טוב");
            } else if (grade <= 75) {
                System.out.println("טוב");
            } else if (grade <= 85) {
                System.out.println("כמעט טוב מאד");
            } else if (grade <= 95) {
                System.out.println("טוב מאד");
            } else {
                System.out.println("מצוין");
            }
        }
    }
}
