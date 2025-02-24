package Strings;

import java.util.Arrays;

public class tolower {
    public static void main(String[] args) {

        StringBuilder ans = new StringBuilder();
        ans.append("0");
        StringBuilder ans2 = new StringBuilder();
        int n=3;
        int k=1;

        for (int i = 1; i <n; i++) {
            ans2.replace(0,ans2.length(),invert(ans.toString()));
              String s2 =(ans.toString())+ "1" +ans2.reverse();
            ans.replace(0,ans.length(), (s2));




        }
        System.out.println(ans);
        System.out.println(ans.charAt(k));
    }
    public static String invert(String str){
        return  str.replace('0', '2').replace('1', '0').replace('2', '1');

        }
    }

