package search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // נמצא היעד
            } else if (arr[mid] < target) {
                left = mid + 1; // חיפוש בחצי הימני
            } else {
                right = mid - 1; // חיפוש בחצי השמאלי
            }
        }

        return -1; // היעד לא נמצא
    }

}
