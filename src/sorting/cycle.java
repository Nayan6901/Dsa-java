package sorting;


import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
       int []arr={3,4,5,2,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclesort(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

     static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
