package sorting;

import java.util.Arrays;

public class missingNmber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
       int ans = sort(arr);
//        System.out.println(Arrays.toString(ans));
    }
    static int sort(int [] arr){
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        if(arr[i] != i -1){
            return i;

            }
        return arr.length;
        }

    static  void swap(int [] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


