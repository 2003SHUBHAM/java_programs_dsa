package arr;

public class richestcustomerwealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {2,4,7},
                {3,5,7},
                {5,6,8},

        };
        System.out.println(richest(accounts));


    }
    static int richest(int [][]customer ){
        int largestsum = 0;
        for (int [] accounts:
                customer
             ) {
            int sum = 0;
            for (int money:accounts
                 ) {
                sum+= money;
            }
            if(sum>largestsum){
                largestsum = sum;
            }

        }
     return largestsum;
    }
}
