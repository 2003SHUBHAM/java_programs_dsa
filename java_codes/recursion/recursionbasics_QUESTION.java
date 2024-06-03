public class recursionbasics_QUESTION {
    public static void main(String[] args) {
     rev(5);
    int ans = sum(5);
        System.out.println(ans);
        int ans1 = digitproduct(1214);
        System.out.println(ans1);
        int nas2 = reverse(1234);
        System.out.println(nas2);

    }
    static void rev(int n){
       if(n == 0){
           return;
       }
       else {
           System.out.println(n);
           rev(n-1);
           System.out.println(n);
       }
    }
    static int product(int n){
        if(n==1){
            return 1;
        }
        else {
           return  n * product(n-1);
        }
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return  n  + sum(n-1);
        }
}
   static int digitsum(int n){
        if(n/10 == 0){
            return n;
        }
        else {
            return n%10 + digitsum(n/10);
        }
   }
    static int digitproduct(int n){
        if(n/10 == 0){
            return n;
        }
        else {
            return n%10 * digitproduct(n/10);
        }
}
   static int reverse(int n ){
        int count = 0;
        while(n!=0){
            n = n/10;
            n/=10;
            count++;
        }
       if(n/10 == 0){
           return n;
       }
       else{
           return n%10 * (int)Math.pow(10,count) + reverse(n/10);
       }

   }
}
