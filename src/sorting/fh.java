package sorting;

public class fh {
    public static void main(String[] args) {
        int nums[]={0,4,3,0,4};

        for (int i=0;i<=nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if (i<=nums[j]){
                    count++;

                }
            }
            if (i==count){
                System.out.println(count);
            }


        }
        System.out.println(-1);

    }
}
