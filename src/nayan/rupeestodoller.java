package nayan;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class rupeestodoller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter rupees:");
        Long rupees= input.nextLong();
        double usd=rupees/82.67;
        System.out.println( usd+" usd");

    }
}
