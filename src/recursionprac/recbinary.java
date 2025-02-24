package recursionprac;

public class recbinary {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(search(arr,3,arr.length-1,0));

    }

    public static int search(int []arr,int target,int end,int start){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]>target){
            return search(arr,target,mid-1,start);

        }if(arr[mid]<target){
            return search(arr,target,end,mid+1);
        }
        return mid;
    }

}
