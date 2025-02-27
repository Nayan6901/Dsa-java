package recursionprac;

public class liniear_rec_index {
    public static int indexof(int []arr,int target,int index){
        if(index==arr.length){
            return -1;
        }if(arr[index]==target){
            return index;

        }else{
            return indexof(arr,target,index+1);
        }

    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(indexof(arr,8,0));
    }

}
