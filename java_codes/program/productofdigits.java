package program;

public class productofdigits {
    public static void main(String[] args) {
        System.out.println(digitpr(2198));
    }
    static int digitpr(int n){
        if(n%10 ==n){
            return n;
        }
         return n%10 * digitpr(n/10);
    }
}
