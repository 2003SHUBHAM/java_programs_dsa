package recursion;

import java.util.ArrayList;

public class arraylistinlinear {
    public static void main(String[] args) {
        int [] arr = {2,4,4,7,9,3};
        ArrayList<Integer> ans = search2(arr,4,0,new ArrayList<>());
    }
    static ArrayList<Integer> search2(int [] arr , int target , int index, ArrayList<Integer> list){
        if(index == arr.length ){
            return  list;
        }

        if( arr[index] == target){
            list.add(index);
        }
        return  search2(arr,target,index +1,list);
    }
}
