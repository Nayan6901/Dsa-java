package sorting;

public class mising {
    public static void main(String[] args) {
        int []nums={3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if (correct<nums.length && nums[i]!=nums[correct]){


                    swap(nums,i,correct);

                }
            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){

            if (nums[j]!=j){
                return j;
            }


        }

        return nums.length;
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}

