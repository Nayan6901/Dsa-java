package nayan;

import java.util.Scanner;

public class occurancecounter {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the num you have to cheack:");
        int count=0;
        int n= num.nextInt();
        System.out.println("enter which num you have to cheack");
        int num1=num.nextInt();
        while(n>0){
           int m=n%10;
           if(m==num1){
               count=count+1;
           }
           n=n/10;
        }
        System.out.println(count);
    }
}
