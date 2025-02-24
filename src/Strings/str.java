package Strings;

public class str {
    public static void main(String[] args) {
        String s="abcabcabc";
        String y="ab";
        StringBuilder ans=new StringBuilder();
        ans.append(s);
        while(s.contains(y)){
            int i=s.indexOf(y);
            int lastindex=i+y.length();
            ans.delete(i,lastindex);
            s= ans.toString();

        }
        System.out.println(s);
    }
}
