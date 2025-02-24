


public class shuffle {
    public static void main(String[] args) {
        // to find maximum number
        //target is equal to max
        int[] arr={1,2,3,4,5,6,7,5,4,3};



    }
    public int[] searchRange(int[] nums, int target) {

        int [] ans ={-1,-1};
        int start =search(nums,target,true);
        int end =search(nums,target,false);
        ans[0]=start;
        ans[1]=end;


        return ans;
    }

}int search(int []nums, int target ,boolean searchfirstindex){
    int start = 0;
    int end =nums.length - 1;
    int ans =-1;


    while (start <= end) {

        int mid = start + (end - start) / 2;
        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target >nums [mid]) {
            start = mid + 1;


        } else {
            ans =mid;
            if (searchfirstindex){
                end =mid-1;
            }else {
                start=mid+1;

            }

            //default

        }

    }
    return ans;
}

public void main() {
}



































          
          










