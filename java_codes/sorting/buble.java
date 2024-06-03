package sorting;

import java.util.Arrays;

public class buble {
    public static void main(String[] args) {
        int [] arr = {10 ,23,45,7,8,90};
        buble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void buble(int [] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false ;
            for (int j = 1; j < arr.length -i; j++) {

                 if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
}
