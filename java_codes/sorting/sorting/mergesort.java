package sortin;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
         int [] arr = {1,7,4,3,2,5};
          mergesortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergesort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left, right);
    }
     static int [] merge(int[] first , int [] second){
        int i = 0;
        int j = 0;
        int k =0;
        int [] ans = new int[first.length + second.length];
        while(i < first.length  && j< second.length ){
            if(first[i]< second[j]){
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
     }

     static void mergesortInplace(int [] arr,int s ,int e){
        if(e-s ==1){
            return;
        }
        int mid = (s + e)/2;
        mergesortInplace(arr,0,mid);
        mergesortInplace(arr,mid,e);

        mergeinplace(arr , s ,mid, e);

     }
     static void mergeinplace(int[] arr , int s , int m , int e ){
         int i = s;
         int j = m;
         int k =0;
         int [] ans = new int[e-s];
         while(i < m  && j< e ){
             if(arr[i]< arr[j]){
                 ans[k] = arr[i];
                 i++;
             }
             else{
                 ans[k] = arr[j];
                 j++;
             }
             k++;
         }
         while(i<m){
             ans[k] = arr[i];
             i++;
             k++;
         }
         while(j< e){
             ans[k] = arr[j];
             j++;
             k++;
         }
         for (int l=0; l< ans.length; l++){
             arr[s + l]=ans[l];
         }


     }

}
