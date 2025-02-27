package recursionprac;

public class linear_recursion_boolean {
    public static boolean search(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target ||search(arr,target,index+1);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,7};
        System.out.println(search(arr,8,0));
    }

}
