package arrays;

public class maxsubarr {
    public static void main(String[] args) {

    }

public static int subarray(int [] arr,int k){
    int start =0;
    int end =0;
    for (int i = 0; i <arr.length; i++) {
         start=Math.max(start,arr[i]);
         end=end+arr[i];
    }
    while(start<end){
        int mid =start+(end-start)/2;
        int sum=0;
        int pices=1;

        for(int num : arr){
            if (sum+num>mid){
                sum=num;
                pices++;

            }else{
                sum=sum+num;
            }
        }
        if (pices>k){
            start=mid+1;

        }else{
            end=mid;

        }
    }return end;
}


}

