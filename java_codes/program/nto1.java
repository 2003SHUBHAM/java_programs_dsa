package program;

public class nto1 {
    public static void main(String[] args) {
        numbers(5);
        System.out.println(fact(20));
        System.out.println(sum(5));
    }
    static void numbers(int n ){
        if(n<1){
            return ;
        }
        System.out.println(n);
         numbers(n-1);
        System.out.println(n);
    }
     static long fact(int n ){
        if(n<=1){
            return 1;
        }
         return n * fact(n-1);
     }
    static long sum(int n ){
        if(n<=1){
            return n;
        }
        return n + sum(n-1);
    }

}
