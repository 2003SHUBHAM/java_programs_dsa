public class ceilingbinarysearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 19;
        int ans = ceilingbinarySearch(arr, target);
        System.out.println(ans);

    }
//    ceiling in binarysearch is defined as the smallest element in the array which is greater or equal to the target

    static int ceilingbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length -1]){
            return -1;
        }

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
