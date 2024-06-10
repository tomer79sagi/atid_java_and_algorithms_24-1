import java.util.Scanner;

public class HourExample {
    public static void main(String[] args) {
//        int minutes = 267;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your minutes:");
        int input = in.nextInt(); // => Wait for user input

        int hours = input / 60;
        int remainingMinutes = input % 60;
        float finalHours = hours + (remainingMinutes / 60f);

        System.out.printf("Hours: %d\n", hours);
        System.out.printf("remainingMinutes: %d\n", remainingMinutes);
        System.out.printf("remainingMinutes as hours: %f\n", remainingMinutes / 60f);

        System.out.printf("Total Hours: %f", finalHours);
    }
}