package arrays;

public class bignumarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,4,3,0};

        int ans = binarySearch(arr);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {

                end = mid;
            } else  {
                start = mid+1;
            }


        }
        return start;
    }
}
