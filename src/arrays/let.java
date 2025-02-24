package arrays;

import java.util.Arrays;

public class let {
    public static void main(String[] args) {
        int []digits={9,8,7,6,5,4,3,2,1,0};
        long ans = 0;

        for (int i = 0; i < digits.length; i++) {
            ans = ans * 10 + digits[i];
        }
        ans=ans+1;

        String numberString = Long.toString(( ans));
        int[] digitss= new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digitss[i] = Character.getNumericValue(numberString.charAt(i));
        }

        System.out.println(Arrays.toString(digitss));

    }
    }



