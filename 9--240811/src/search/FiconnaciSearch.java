package search;

public class FiconnaciSearch {
    public static int fibonacciSearch(int[] arr, int target) {
        int n = arr.length;
        int fibMm2 = 0; // פיבונאצ'י (m-2)
        int fibMm1 = 1; // פיבונאצ'י (m-1)
        int fibM = fibMm2 + fibMm1; // פיבונאצ'י m

        while (fibM < n) {
            fibMm2 = fibMm1;
            fibMm1 = fibM;
            fibM = fibMm2 + fibMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibMm2, n - 1);

            if (arr[i] < target) {
                fibM = fibMm1;
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
                offset = i;
            } else if (arr[i] > target) {
                fibM = fibMm2;
                fibMm1 -= fibMm2;
                fibMm2 = fibM - fibMm1;
            } else
                return i;
        }

        if (fibMm1 == 1 && arr[offset + 1] == target)
            return offset + 1;

        return -1; // האלמנט לא נמצא
    }

}
