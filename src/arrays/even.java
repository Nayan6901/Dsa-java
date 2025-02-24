package arrays;

import java.util.Arrays;

public class even {
    public static void main(String[] args) {
        int[]nums={8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        mostFrequentEven(nums);
    }
    public static int mostFrequentEven(int[] nums) {
        if(nums.length==1 && nums[0]%2==0){
            return nums[0];
        }
        Arrays.sort(nums);
        int count1=0;
        int orgnum=0;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]%2!=0){
                continue;


            }
            else if(nums[i]==nums[i-1] && nums[i]%2==0){
                count++;

            }else{count=1;}
            if(count>count1 && nums[i]%2==0){
                count1=count;

                orgnum=nums[i];
            }
        }
        return orgnum;


    }
}
