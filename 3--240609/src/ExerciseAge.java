import java.util.Scanner;

public class ExerciseAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = in.nextInt();

        if (age >= 70) { //If age is 70 or above
            System.out.println("Mature");
        } else if (age >= 45) { // If age is between 45 and 69 (inclusive)
            System.out.println("Adult");
        } else {
            if (age <= 4) {
                System.out.println("Baby");
            } else {
                System.out.println("Young");
            }
        }
    }
}
