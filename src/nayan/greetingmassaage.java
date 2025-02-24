package nayan;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class greetingmassaage {
    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner name = new Scanner(System.in);
         String A =name.next();




            String b= "have a good day ";
             String c=" sir";
             System.out.println(b+A+c);


           System.out.println("to canlculate ypur simple interst provide below information");

        System.out.print("Enter your Principle amount:");
        Float p= name.nextFloat();
        System.out.print("Enter your time:");
        Float T= name.nextFloat();
        System.out.print("Enter your Interest Rate:");
        Float R= name.nextFloat();

        Float SI = p*R *(T/100);
        System.out.println(SI);




    }
}
