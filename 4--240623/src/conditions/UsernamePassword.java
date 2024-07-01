package conditions;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        // Expected variables
        String expectedUsername = "tomersagi";
        String expectedPassword = "12345";

        // Input variables
        Scanner sc = new Scanner(System.in);

        // Input the username
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        // Input the password
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
            System.out.println("Logged in successfully.");
        } else {
            System.out.println("Login failed.");
        }

    }
}
