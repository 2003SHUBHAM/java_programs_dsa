package binarysearch;

public class smallestletter {public static void main(String[] args) {
    char [] arr = {'a','c','d'};
    char ans = binary(arr,0,arr.length-1,'b');
    System.out.println(ans);

}
    static char binary(char [] arr , int start , int end , char target){
    while (start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else {
                end = mid - 1;
            }

        }
        return arr[start%arr.length];
    }
}
