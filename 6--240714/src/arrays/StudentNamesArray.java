package arrays;

import java.util.Scanner;

public class StudentNamesArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // מגדירים מערך / ארונית עם 6 מגירות שבכל מגירה יש מחרוזת
        // עבור שמות תלמידים בכיתה
        String[] names = new String[6]; // --> Range, 0-5

        // למלא את המערך עם שמות שקולטים מהמשתמש
        for (int i=0 ; i<names.length ; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();
        }

        // נדפיס את המערך
        System.out.println("-- רשימת התלמידים --");
        for (int i = 0; i <names.length ; i++) {
            System.out.printf("Name: %s\n", names[i]);
        }

        // זה זורק שגיאה, כי אין מקום 6 במערך בגודל 6 (כי הטווח הוא מקומות מ-0 עד 5)
//        names[6] = "George";


        // הגדרת מערך עם הצבת ערכים (ללא הגדרת גודל - נקבע אוטומטית)
        String[] names2 = {"Tomer", "Dilan", "Liran", "Igor", "Guy", "Roi"};
        for (String name : names2) {
            System.out.println(name);
        }

    }
}
