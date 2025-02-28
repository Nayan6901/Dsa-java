package recursionprac;

import java.util.ArrayList;

public class returning_array_list {
    public static  ArrayList indexof(int []arr, int target, int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;

        }if(arr[index]==target) {
            list.add(index);
        }
        ArrayList <Integer> allindwxfrombelow=indexof(arr, target, index + 1);

      list.addAll(allindwxfrombelow);
      return list;


    }

    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5,6};System.out.println(indexof(arr,3,0));
    }
}
