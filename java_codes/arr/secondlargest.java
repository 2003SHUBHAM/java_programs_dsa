package arrays;

public class secondlargest {
    public static void main(String[] args) {
        int [] arr = {5,2,3,7,7,7,6};
        int ans = slargest(arr,arr.length);
        System.out.println(ans);
    }
    static int slargest(int [] arr , int n){
        int lar = arr[0];
        int slar = -1;
        for (int i = 1; i < n ; i++) {
            if(arr[i] > lar){
                slar = lar;
                lar = arr[i];

            } else if (arr[i] < lar && arr[i] > slar ) {
                slar = arr[i];
            }

        }
        return slar;
    }
}
