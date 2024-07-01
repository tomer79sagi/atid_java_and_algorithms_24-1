package loops;

import java.util.Random;

public class ForBreak {
    public static void main(String[] args) {

        // לעשות לולאה שרצה 20 פעמים
        // בכל פעם היא תייצר מספר רנדומאלי בין 1 ל-100
        // במידה והמספר קטן מ-10, המערכת תדפיס הודעה ותפסיק
        Random rnd = new Random();
        for (int i=0 ; i < 20 ; i++) {
            int x = rnd.nextInt(100) + 1;

            System.out.println(x);

            if (x < 10) {
                System.out.println("FOUND A NUMBER LOWER THAN 10!!");
                break;
            }
        }
    }
}
