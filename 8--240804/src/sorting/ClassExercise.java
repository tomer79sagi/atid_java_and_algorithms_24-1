package sorting;

import java.util.Arrays;

public class ClassExercise {

    // פונקציה שמקבלת מערך מספרים שלמים
    // ומחזירה מערך מספרים שלמים ממוין לפי סדר עולה
    public static int[] sort(int[] arr) {
        // לולאה שרצה מ-0 עד איבר אחד לפני אחרון - כי אני בודק זוגות
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("i: " + i);

            // לולאה שרצה מ-0 עד איבר אחד לפני האיבר ה-i (הוא גדל כל הזמן, ולכן הסוף של ה-j קטן)
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.print(j + ": " + arr[j] + " | " + arr[j + 1]);

                if (arr[j] > arr[j + 1]) { // In this case, swap
                    int temp = arr[j]; // e.g. temp = arr[0]
                    arr[j] = arr[j + 1]; // e.g. arr[0] = arr[1]
                    arr[j + 1] = temp;
                    System.out.print("\tSWAP");
                } else {
                    System.out.print("\t\t");
                }

                System.out.print("\t" + Arrays.toString(arr));
                System.out.println();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] intArray = {4, 6, 7, 89, 2, 3, 45, 6, 7, 9};

        // המימוש שלנו
        int[] sortedArray = sort(intArray);
        System.out.println(Arrays.toString(sortedArray));

        // Sorting run (pairs)
//        {4, 6, 7, 2, 89, 3, 45, 6, 7, 9};
//        {4, 6, 7, 2, 3, 89, 45, 6, 7, 9};
//        {4, 6, 7, 2, 3, 45, 89, 6, 7, 9};
//        {4, 6, 7, 2, 3, 45, 6, 89, 7, 9};
//        {4, 6, 7, 2, 3, 45, 6, 7, 89, 9};
//        {4, 6, 7, 2, 3, 45, 6, 7, 9, 89};

//        {4, 6, 2, 7, 3, 45, 6, 7, 9, 89};
//        {4, 6, 2, 3, 7, 45, 6, 7, 9, 89};
//        {4, 6, 2, 3, 7, 6, 45, 7, 9, 89};
//        {4, 6, 2, 3, 7, 6, 7, 45, 9, 89};
//        {4, 6, 2, 3, 7, 6, 7, 9, 45, 89};

//        {4, 2, 6, 3, 7, 6, 7, 9, 45, 89};
//        {4, 2, 3, 6, 7, 6, 7, 9, 45, 89};
//        {4, 2, 3, 6, 6, 7, 7, 9, 45, 89};

//        {2, 4, 3, 6, 6, 7, 7, 9, 45, 89};
//        {2, 3, 4, 6, 6, 7, 7, 9, 45, 89};

        // מימוש באמצעות פונקציות של ג'אווה
//        System.out.println("Before: " + Arrays.toString(intArray));
//        Arrays.sort(intArray);
//        System.out.println("After: " + Arrays.toString(intArray));
    }
}
