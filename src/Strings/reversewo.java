package Strings;

public class reversewo {
    public static void main(String[] args) {
        String s="agoodexample";
        System.out.println(  reverseWords(s));
        System.out.println(s.indexOf("am"));



    } public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String [] s1=s.split(" ");

        for(int i=s1.length-1;i>=0;i--){
            if(s1[i].equals("")){
               continue;
            }else{

                ans.append(s1[i]).append(" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}

