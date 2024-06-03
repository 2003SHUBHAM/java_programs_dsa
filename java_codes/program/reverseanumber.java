package program;

public class reverseanumber {
    public static void main(String[] args) {
        System.out.println(reverse(8421));

    }
    static int reverse(int n){
        if(n%10 ==n){
            return n;
        }
        int rem = n%10;
        return rem *10 + reverse(n/10);
    }
}
