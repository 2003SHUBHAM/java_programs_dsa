package recursion;

public class arrays {
    public static void main(String[] args) {
        int [] arr = {2,4,10,8};
        System.out.println(issorted(arr,0));
    }
    static  boolean issorted(int [] arr , int index ){
        if(index == arr.length - 1){
            return true;

        }

        return arr[index] < arr[index + 1] && issorted(arr,index +1);

    }
}
