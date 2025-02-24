package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class firstarray {
    public static int[]runningsum (int[]nums) {
        int[] runningsum = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            if(i==0){
                runningsum[i]=nums[i];
            }
            runningsum[i] = nums[i]+nums[i+1];
        }





        return runningsum;
    }

}




