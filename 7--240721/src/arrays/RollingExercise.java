package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RollingExercise {
    public static void main(String[] args) {
        part1();
//        part2();
//        part3();
    }

    private static void part1() {
        String[] students;
        System.out.printf("Current Time: %d ms\n", System.currentTimeMillis());

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        students = new String[n];

        for (int i = 1; i <= n; i++) {
            System.out.print("Student #" + i + ": ");
            students[i-1] = sc.next();
        }

        // Print all students
        System.out.println("\nList of Students");
        // Loop over ALL elements ==> O(n) ==> n == students.length
        long timeBefore = System.currentTimeMillis();
        for (int i=0 ; i<students.length ; i++) {
            System.out.printf("Student %d: %s\n", i+1, students[i]);
        }
        long timeAfter = System.currentTimeMillis();
        long diff = timeAfter - timeBefore;
        System.out.printf("Task took: " + diff + " ms\n");
    }

    private static void part2() {
        String[][] students;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        students = new String[n][];

        for (int i = 0; i < n; i++) {
            students[i] = new String[5];
            System.out.print("\nStudent #" + (i+1) + " - Subjects\n");

            for (int j=0 ; j<students[i].length ; j++) {
                System.out.print("Subject #" + (j+1) + ": ");
                String subject = sc.next();

                if (subject.equals("x")) {
                    break;
                } else {
                    students[i][j] = subject;
                }
            }
        }

        // Print all students
        System.out.println("\nList of Students");
        for (int i=0 ; i<students.length ; i++) {
            System.out.printf("Student %d: \n", i+1);
            for (int j=0 ; j<students[i].length && students[i][j] != null ; j++) {
                System.out.print((j > 0 && j<students[i].length ? "," : "") + students[i][j]);
            }
        }
    }

    public static void part3() {

    }
}
