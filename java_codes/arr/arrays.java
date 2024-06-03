import org.w3c.dom.ls.LSOutput;

public class arrays {
    public static void main(String[] args) {
      /*  int[] num = {3, 4, 5, 7, 8};
        int l = num.length;
        int n = Math.floorDiv(5, 2);
        for (int i = 0; i < n; i++) {
            int temp = num[i];
            num[i] = num[l - 1 - i];
            num[l - 1 - i] = temp;
        }
        for (int element : num
        ) {
            System.out.print(element + " ");

        }
        float[] num1 = {2.3f, 3.2f, 4.6f, 5.9f};
        float sum = 0;
        for (float elem:num1
        )

        {

            sum += elem;
        }
        System.out.println(sum);
        int [] arr = {2,4,6,7,9};
        int a = 3;
        int x = arr.length - 1;
        boolean  b =false;
        for(int i =0 ; i <= x; i ++){
            if(arr[i]==a){
                 b = true;
                break;
            }

            }
        if(b){
            System.out.println("te element is present in array");
        }
        else{
            System.out.println("the element is not present in array");
        }
    */
           int [][] mat1 = {{2,4,6},{3,8,7}};
           int[][] mat2 = {{3,5,7},{4,6,8}};
           int[][] mat3 = {{0,0,0},{0,0,0}};
           for(int i =0 ; i <mat1.length; i++){
               for (int j= 0 ;j < 3; j ++){
                   mat3[i][j]= mat1[i][j] + mat2[i][j];
                   System.out.print( " " + mat3[i][j]);
               }
               System.out.println();
           }
          int [] num = {9,7,8,5,3};
           int max = 0 ;
           int l = num.length - 1;
           for (int i =0 ; i <=l;i++){
               if (num[i]> max){
                   max=num[i];
               }
           }
        System.out.println("the maximum element is " + max);

        }



}

