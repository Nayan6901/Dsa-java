package arrays;

public class minimumbin {
    public static void main(String[] args) {
        int nums []={4,5,1,2,3};
        int ans=findMin(nums);
        System.out.println(ans);

    } public static int findMin(int[] nums) {
        int start=0;
        int end =nums.length-1;
        while (start<=end){
            int mid =start+(end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            } if (start<mid && nums [mid]<nums[mid-1] ){
                return mid;
            }

            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;


            }
        }return nums[0];


    }
}
