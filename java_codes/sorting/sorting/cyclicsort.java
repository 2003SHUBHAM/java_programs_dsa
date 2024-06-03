package sortin;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int [] arr = {2,1,4,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cyclic(int [] arr){
        for (int i = 0; i < arr.length ; i++) {

            int correctindex = arr[i] -1 ;
            if(arr[i] != arr[correctindex]){
                swap(arr , i,correctindex);
            }



        }
    }
    static void  swap ( int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
