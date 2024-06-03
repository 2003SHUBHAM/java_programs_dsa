package recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
         int [] arr = {2,4,4,7,9,3};
       ArrayList<Integer> ans = search3(arr,4,0);
        System.out.println(ans);
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
    static ArrayList<Integer> search3(int [] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length ){
            return  list;
        }
        if( arr[index] == target){
            list.add(index);
        }
       ArrayList<Integer> ansfrombelowcalls =  search3(arr,target,index +1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
