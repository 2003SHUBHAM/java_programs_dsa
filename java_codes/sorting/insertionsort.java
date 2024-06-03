//import java.util.Arrays;

//public class insertionsort {
//    public static void main(String[] args) {
//        int [] arr = {5,4,3,2,1};
//        selectionsort(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }

//    static  void selectionsort(int [] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            int last = arr.length - i - 1;
//            int maxindex = getMaxindex(arr, 0, last);
//            swap(arr, maxindex,last);
//        }
//    }
//    static int getMaxindex(int [] arr, int start, int end ){
//        int max = start;
//        for (int i = 0; i < end; i++) {
//        if(arr[i]>arr[max]) {
//            max = i;
//        }
//        return max;
//
//
//    }
//    static void insertionSort(int []arr){
//        for (int i = 0; i <arr.length -1 ; i++) {
//            for (int j = i+1; j >0 ; j--) {
//                if(arr[j-1]>arr[j]){
//                    swap(arr,j-1,j);
//                }
//                else{
//                    break;
//                }
//            }
//        }
//
//    }
//    static void bubblesort(int [] arr ){
//        boolean issorted;
//        for (int i = 0; i <arr.length ; i++) {
//            issorted =true;
//            for (int j = 1; j < arr.length-i ; j++) {
//                if(arr[j]<arr[j-1]){
//                    swap(arr,j-1,j);
//                    issorted =false;
//                }
//            }
//            if(issorted){
//                break;
//            }
//
//        }
//    }
//    static void swap(int [] arr,int first , int second ){
//        int temp = arr[first];
//        arr[first]= arr[second];
//        arr[second]= temp;
//    }
//
//}
//