package sortin;

public class Firstmissingpositivee {
    public static void main(String[] args) {
        int [] arr ={4,2,2,1};
        int ans = Mising(arr);
        System.out.println(ans);
//        System.out.println(Arrays.toString(arr));

    }
    static  int Mising(int [] arr){
        int i =0;
        while(i < arr.length){
            int correctindex = arr[i] -1  ;
            if(arr[i]> 0 && arr[i] <= arr.length && arr[i] != arr[correctindex]){
                swap(arr , i,correctindex);
            }

            else{
                i++;
            }

        }
        for (int index  = 0; index  < arr.length ; index ++) {
            if(arr[index]!= index +1){
                return index + 1;
            }

        }
        return arr.length + 1;

    }
    static void  swap ( int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
