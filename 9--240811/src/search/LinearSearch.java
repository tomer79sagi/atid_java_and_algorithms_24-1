package search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // נמצא היעד, החזר את האינדקס שלו
            }
        }
        return -1; // היעד לא נמצא
    }

}
