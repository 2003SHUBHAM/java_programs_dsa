package arrays;

public class removes_duplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3,3};
        int ans = remdp(arr);
        System.out.println(ans);
    }
    static int remdp(int [] arr){
        int i = 0;

        for(int j = 1 ; j < arr.length; j ++){
            if(arr[j]!=arr[i]){
                arr[i+1]= arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
