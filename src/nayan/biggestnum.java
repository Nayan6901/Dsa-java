package nayan;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number

public class biggestnum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter your first number = ");
        Long num1 = input.nextLong();
        System.out.print("enter your Second number = ");
        Long num2 =input.nextLong();

        if(num1==num2){
            System.out.println("both number are equal");

        } else if (num1>num2) {
            System.out.println("largets number is :"+num1);

        }else {
            System.out.println("largets number is :"+num2);
        }


    }
}
