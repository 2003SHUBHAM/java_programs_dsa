package sortin;

import java.util.ArrayList;
import java.util.List;

public class duplicateno {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2,2};
        List <Integer> an =  C(arr);
        System.out.println(an);
    }
    static  int duplicate(int [] nms){
        int i =0;
        while(i < nms.length){
            int correctindex = nms[i] - 1;
            if(  nms[i] != nms[correctindex]){
                swap(nms , i,correctindex);
            }

            else{
                i++;
            }

        }
        for (int index  = 0; index  < nms.length ; index ++) {
            if(nms[index]!= index +1){
                return nms[index] ;
            }

        }
        return -1;

    }
    static void  swap ( int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static  List <Integer> C(int [] nms){
        int i =0;
        List<Integer> ans = new ArrayList<>();
        while(i < nms.length){
            int correctindex = nms[i] - 1;
            if(  nms[i] != nms[correctindex]){
                swap(nms , i,correctindex);
            }

            else{
                i++;
            }

        }
        for (int index  = 0; index  < nms.length ; index ++) {
            if(nms[index]!= index +1){
                 ans.add(nms[index]);
            }

        }

    return ans;
    }

    }


