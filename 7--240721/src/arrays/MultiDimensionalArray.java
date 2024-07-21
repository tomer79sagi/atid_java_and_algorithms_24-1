package arrays;

import java.util.Random;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // מערך דו-מימדי
        // נניח 7 ימים בשבוע ובכל יום 6 מספרי לוטו
        // 1. להגדיר את עומק המערך - כמות המימדים
        int[][] lottoNumbersInWeek;
        lottoNumbersInWeek = new int[7][];
        // lottoNumbersInWeek[0] = new int[6]; // 6 מקומות ליום ראשון
        // lottoNumbersInWeek[1] = new int[6]; // 6 מקומות ליום שני

        Random rand = new Random();
        // לולאה על ימות השבוע - מימד 1
        for (int dayInWeek=0 ; dayInWeek<lottoNumbersInWeek.length ; dayInWeek++) {
            lottoNumbersInWeek[dayInWeek] = new int[6];
            // לולאה על 6 מספרים - מימד 2
            for (int numberPosition=0 ; numberPosition<6 ; numberPosition++) {
                lottoNumbersInWeek[dayInWeek][numberPosition] = rand.nextInt(59) + 1;
            }
        }

        // להדפיס מערך דו-מימדי
        for (int dayInWeek=0 ; dayInWeek<lottoNumbersInWeek.length ; dayInWeek++) {
            System.out.print("Day " + (dayInWeek + 1) + ": ");
            // לולאה על 6 מספרים - מימד 2
            for (int numberPosition=0 ; numberPosition<6 ; numberPosition++) {
                System.out.print(lottoNumbersInWeek[dayInWeek][numberPosition] + "\t");
            }
            System.out.println();
        }
    }
}
