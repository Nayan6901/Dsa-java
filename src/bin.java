

public class bin {
    public static void main(String[] args) {
        int []nums={1,5,1,2,3,6,1};
        int orgsum =0;
        int i=0;
        while(i<nums.length-1){
            int sum=nums[i];
            int j;
            for(j=i+1;j<nums.length;j++){

                if(nums[j]>nums[j-1]){
                    sum=sum+nums[j];

                }else{
                    i=j;
                    break;

                }
            }
            if(orgsum<sum){
                orgsum=sum;
            }
            if(j==nums.length){
                break;
            }

        }
        System.out.println(orgsum);
    }
}





