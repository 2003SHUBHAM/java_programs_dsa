package sortin;

import java.util.Arrays;

public class ouicksort {
    public static void main(String[] args) {
      int[] arr =new int[]{7,2,5,4,9,23,45,12,3,7,98};
      int p = 0;
      int q = arr.length -1;
        quicksort(arr,p,q);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int [] arr , int p , int q){
        if (p < q) {
            int m = partition(arr,p,q);
            quicksort(arr,p,m-1);
            quicksort(arr,m+1,arr.length -1);
        }

    }
    static  int partition(int [] arr , int p , int q){
        int x = arr[p];
        int i = p;
        for(int j = p+1; j <=q ; j++){
            if(arr[j] < x){
                i = i+1;
                swap(arr, i,j);
            }
        }
        swap(arr,p,i);
        return i;
    }
    static  void swap(int[]arr,int a , int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }

}
