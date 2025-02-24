package arrays;

public class searchinmountain {
    static int main (String[] args) {
        int[] arr = {1,2,3,6,7,4,3,0};
        int target =3;
        int peak=binarySearchpeak(arr);
        int first =binarySearch(arr,target,0,peak);
        if (first!=-1){
            System.out.println(first);
        }
        return orderAgnosticBS(arr,target,peak,arr.length-1);



    }

    // return the index
    // return -1 if it does not exist
    static int binarySearchpeak(int[] arr) {

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



    static int binarySearch(int[] arr, int target,int start, int end) {


        while(start <= end) {
            // find the middle
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end) {


        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

