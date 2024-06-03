public class highestaltitude {
    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};
        int ans = highestalt(gain);
        System.out.println(ans);

    }
    static int highestalt(int [] gain){
        int [] alt = new int[gain.length + 1];
        alt[0] = 0;
        alt[1] = gain[0];
        for (int i = 1; i < gain.length ; i++) {
            alt[i +1] = alt[i] + gain[i];

        }
        int max = alt[0];
        for (int i = 1; i < alt.length ; i++) {
            if(max < alt[i]){
                max = alt[i];
            }

        }
        return max;
    }
}
