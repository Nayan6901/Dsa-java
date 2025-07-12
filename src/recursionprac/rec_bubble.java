package recursionprac;

import java.util.Arrays;

public class rec_bubble {
    public static void main(String[] args) {
        int []arr={4,3,2,1,};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr,int lastindex,int firstindex){
        if(lastindex==0){
            return;
        }if(lastindex>firstindex){
        if(arr[firstindex]>arr[firstindex+1]){
            int temp=arr[firstindex];
            arr[firstindex]=arr[firstindex+1];
            arr[firstindex+1]=temp;
        }


            bubble(arr,lastindex,firstindex+1);
        }else {


            bubble(arr,lastindex-1,0);

        }
    }

}
