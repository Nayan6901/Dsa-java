package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        List<Integer> ans= cyclesort(arr);
        System.out.println(ans);
    }static List<Integer> cyclesort(int []arr){
     List<Integer> ans =new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index <arr.length; index++) {
            if (arr[index]!=index+1){
                ans.add(index+1);

            }

        }return ans;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
