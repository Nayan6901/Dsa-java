package arrays;

public class sim {
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        int ans =findDuplicate(nums);
        System.out.println(ans);
    }  public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){

            for (int j=0;j<nums.length;j++){
                if (i==j){
                    continue;
                }
                if (nums[i]==nums[j]){

                    return nums[j];

                }
            }
        }return -1;

    }
}

