package arrays;

import java.util.Arrays;

public class roatatearrbyoneplace {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] ans = leftrotate1(arr,arr.length,2);

        System.out.println(Arrays.toString(ans));

    }
    static int [] leftrotate(int [] arr , int n){
        int temp = arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

    // left rotate array by k place bybrute force approach
    static int [] leftrotate1(int [] arr , int n,int d){
        d = d%n;
        int [] temp = new int[d];
        for (int i = 0; i <=d ; i++) {
            temp[i] = arr[i];

        }
        for (int i = d ; i <= n; i++) {
            arr[i -(d)] = arr[i];

        }
        for (int i = 0; i <=d ; i ++){
            arr[i+d] = temp[i];
        }
        return arr;
    }
}
