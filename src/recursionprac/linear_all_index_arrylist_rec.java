package recursionprac;

import java.util.ArrayList;

public class linear_all_index_arrylist_rec {


   static ArrayList<Object> ans=new ArrayList<>();
    public static  void indexof(int []arr, int target, int index){

        if(index==arr.length){
             return;
        }if(arr[index]==target) {
            ans.add(index);
        }

            indexof(arr, target, index + 1);


    }

    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5,6};
        indexof(arr,3,0);
        System.out.println(ans);
    }
}
