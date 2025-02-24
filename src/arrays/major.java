package arrays;

import java.util.Arrays;

public class major {
    public static void main(String[] args) {
        int []nums={};
        majorityElement(nums);


    }
        public static int majorityElement(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            Arrays.sort(nums);
            int count1=0;
            int orgnum=0;
            int count=1;

            for(int i=1;i<nums.length;i++){

                if(nums[i]==nums[i-1]){
                    count++;
                }if(count>count1){
                    count1=count;
                    count=1;
                    orgnum=nums[i];
                }
            }
            return orgnum;


        }
    }

