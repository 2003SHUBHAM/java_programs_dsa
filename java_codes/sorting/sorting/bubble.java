package sorting.sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int [] arr = {4,7,1,2,34,6,7,};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSorting(int [] arr ){
//        for n-1 comparission
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {

            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
