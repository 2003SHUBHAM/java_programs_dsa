package sortin;

import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
       int [] arr ={4,0,2,1};
        int ans = Mising(arr);
        System.out.println(ans);
//        System.out.println(Arrays.toString(arr));

    }
    static  int Mising(int [] arr){
      int i =0;
      while(i < arr.length){
          int correctindex = arr[i]  ;
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr , i,correctindex);
            }

            else{
                i++;
            }

        }
        for (int index  = 0; index  < arr.length ; index ++) {
            if(arr[index]!= index){
                return index ;
            }

        }
        return arr.length;

    }
    static void  swap ( int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
