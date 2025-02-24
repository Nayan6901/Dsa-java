package nayan;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class evenorodd {
    public static void main(String[] args) {

        Scanner even=new Scanner(System.in);
        System.out.print("enter your number:");
        int a =even.nextInt();

        if(a%2==0 ){
            System.out.println("given number is even");

        }
        else {
            System.out.println("given number is odd");
        }

    }
}
