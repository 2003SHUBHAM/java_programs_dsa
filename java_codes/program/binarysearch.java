package program;

public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};
        int target = 0;
        int ans = binary(arr,target,0, arr.length);
        System.out.println(ans);


    }
    static  int binary(int [] arr,int target ,int start ,int end){
        int mid = start + (end - start)/2;
        if (start>end){
            return -1;
        }

        if (arr[mid] ==target){
            return mid;
        }
         if(arr[mid]>target){
            return binary(arr,target,0,mid-1);
        }
        else{
        return binary(arr,target,mid +1,arr.length);
    }

}
}
