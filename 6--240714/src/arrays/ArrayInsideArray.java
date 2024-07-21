package arrays;

import java.util.Arrays;

public class ArrayInsideArray {
    public static void main(String[] args) {

        int[] arrNum = {6,3,8,2,7,32,4,5356,475,54};
        for (int n : arrNum) {
            System.out.print(n + "\t");
        }

        System.out.println();
        Arrays.sort(arrNum);
        for (int n : arrNum) {
            System.out.print(n + "\t");
        }

        // תרגיל: לוח הכפל
        int[][] timesTable = new int[10][10];

        // תרוץ 10 פעמים על המימד הראשון (10 שורות מטבלת לוח הכפל)
        for (int i = 0 ; i<timesTable.length ; i++) {
            // תרוץ 10 פעמים כדי למלא את הערכים לאורך (עמודות)
            for (int j = 0; j < timesTable[i].length; j++) {
                timesTable[i][j] = (i+1) * (j+1);
                System.out.print(timesTable[i][j] + "\t");
            }

            // נרד שורה בסוף השורה
            System.out.println();

        }

        // תרגיל כיתה
        // להדפיס את לוח הכפל בצורה יפה


        // תרגיל בית
        // הגדרה של מערך של מערכים
        // לפתור בעיה של רשימה עם תת רשימה
        // לדוגמא: רשמית תלמידים ועבור כל תלמיד רשימת ציונים
        // לדוגמא: מערך של 6 תלמידים עם 4 ציונים לכל תלמיד
//        int[][] students = new int[6][4];
    }
}
