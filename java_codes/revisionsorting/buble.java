package revisionsorting;

import java.util.Arrays;

public class buble {
    public static void main(String[] args) {
        int [] arr = {-1,-3,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length -i ; j++) {
                if(arr[j-1] > arr[j]){
                    swap(arr , j-1 ,j);
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
    static  void swap( int [] arr , int first , int second){
        int temp = arr[first ];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
