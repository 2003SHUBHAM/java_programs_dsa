package sortin;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class dissappearedno {
    public static void main(String[] args) {
     int [] arr = {1,1};
     List <Integer> ans = cyclic(arr);
        System.out.println(ans);
    }
    static List <Integer> cyclic(int [] arr){
        int i =0;
        List<Integer> a = new ArrayList<>();
        while(i < arr.length){
            int correctindex = arr[i] -1  ;
            if( arr[i] != arr[correctindex]){
                swap(arr , i,correctindex);
            }

            else{
                i++;
            }

        }
        for (int index  = 0; index  < arr.length ; index ++) {
            if(index != arr[index] -1){
                 a.add(index + 1) ;
            }

        }

     return a;
    }
    static void  swap ( int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
