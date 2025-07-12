package arrays;

import java.util.Arrays;
import java.util.Scanner;

//public class firstarray {
//    public static int[]runningsum (int[]nums) {
//        int[] runningsum = new int[nums.length];
//        for (int i = 0; i < nums.length;i++) {
//            if(i==0){
//                runningsum[i]=nums[i];
//            }
//            runningsum[i] = nums[i]+nums[i+1];
//        }
//
//
//
//
//
//        return runningsum;
//    }
//
//}

public class firstarray {
    public static void pattern( int n){
//        char ch = 'A';
        //char ch1 = (char)(64+n);
        for(int i=1; i<=n; i++){

            char ch1 = (char)(64+n);
            for(int j=1; j<=n; j++){
                if(i%2!=0){
                    System.out.print(ch1);

                } else{
                    System.out.print(n);

                }

            }n--;
            System.out.println();
        }
    }
    public static void main (String args[]){
        pattern(4);
    }
}




