package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class buble {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleValue="silver";
        String ruleKey="color";

        // Create inner lists and add them to the outer list
        List<String> innerList1 = new ArrayList<>();
        innerList1.add("computer");
        innerList1.add("silver");
        innerList1.add("lenovo");
        items.add(innerList1);

        List<String> innerList2 = new ArrayList<>();
        innerList2.add("phone");

        innerList2.add("blue");
        innerList2.add("pixel");

        items.add(innerList2);

        // Access an item in the nested list
        // Access "banana"
        ;
        int index;
        if(ruleKey=="type"){
            index=0;
        }else if(ruleKey.equals("color")){
            index=1;
        }else {index=2;}
        int count=0;
        for(int i=0;i<items.size();i++){
            String got=items.get(i).get(index);
            if(ruleValue.equals(got)){

                count++;
            }

        }
        System.out.println(count);;
    }
    }
