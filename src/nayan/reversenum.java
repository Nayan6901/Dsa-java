package nayan;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int num1=num.nextInt();
        int num2 =0;

        while(num1>0){
            int m=num1%10;
            num1=num1/10;
            num2 =num2*10+m;



        }    System.out.println(num2+"");

    }
}
