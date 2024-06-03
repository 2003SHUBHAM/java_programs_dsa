import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int ans = cyclicsort(arr);
        System.out.println(ans);
    }
    static int cyclicsort(int [] arr ){
        int i = 0;
        while(i<arr.length){
            int ci = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[ci]){
                swap(arr,i,ci);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j){
            return j;
        }

    }
        return arr.length;
    }
    static void swap(int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
