package arrays;

public class rotationcount {

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int rotation=rotationcounts(arr);
        System.out.println(rotation+1);


    }
    public static int rotationcounts(int []arr){
        int start=0;
        int end =arr.length-1;
        while (start<=end ){
            int mid =start+(end-start)/2;
            if (mid > start && arr[mid]<arr[mid -1]){
                return mid -1;
            }if (mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
}
