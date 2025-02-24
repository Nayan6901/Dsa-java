package recursion;

public class binarysearchrecursion {
    public static void main(String[] args) {
        int[]arr={2,5,7,8,9,10};
        System.out.println(  binarysearch(arr,10,0,arr.length-1));


    }public static int binarysearch(int []arr,int target,int start,int end){

        int mid=start+(end-start)/2;
        if(start>end) {
            return -1;
        }
        if(arr[mid]>target){

            return binarysearch(arr,target,start,mid-1);
        }if(arr[mid]<target){
            return binarysearch(arr,target,mid+1,end);
        }
        return (mid);

    }


}


