package sorting;

import java.util.Arrays;

public class insertioon {
    public static void main(String[] args) {
        int []arr={9,8,6,5,6,7,8};
        insertionsort(arr);



    }

    static void insertionsort(int arr[]) {

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
        static void swap ( int arr[], int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }

}
