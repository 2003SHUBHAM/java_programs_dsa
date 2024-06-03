package sortin;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {5,3,21,1,5,9};
        bubblesor(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesor(int [] arr){
        int n = arr.length ;
        boolean sorted;
        for (int i = 0; i < n; i++) {
            sorted = false;
            for (int j =1; j < n-i; j++) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    sorted = true;

                }

            }
            if(!sorted){
                break;
            }

        }

    }
    static void swap(int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
