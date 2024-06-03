public class linearsearching {
    public static void main(String[] args) {
        int [] nums = { 70 ,15 , 17, 18,20};
        int target = 21;
        int ans = search(nums,target);
        System.out.println(ans);
        int ans1 = max(nums);
        System.out.println(ans1);
    }
    public static int search(int [] nums , int target){
        for (int element : nums
             ) {
            if(element == target){

                System.out.println("the element is found");
            }
            else {
                return -1;
            }
        }
        return target;
    }
    public static int max(int [] nums ){
        int maxelement = 0;
        for (int element : nums
        ) {
            if(element > maxelement){
              maxelement = element;
//                System.out.println("the element is found");
            }

            }

        return maxelement;
    }
}
