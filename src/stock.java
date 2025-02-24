public class stock {
    public static void main(String[] args) {

        int[] nums={7,1,5,3,6,4};
                maxProfit(nums);

    } public static int maxProfit(int[] nums) {


        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1]-nums[i];
        }
        nums[nums.length-1]=0;

        int sum=0;
        for(int j=0;j<nums.length-1;j++){
            int sum2=0;
            for(int k=j;k<nums.length;k++){

                sum2=  sum2+nums[k];
                if(sum<sum2){
                    sum=sum2;
                }

            }
        }
        return sum;


    }
}
