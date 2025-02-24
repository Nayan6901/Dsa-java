package nayan;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num0 = 0;
        int num1 = 1;
        int numv =num.nextInt();

        for(num0=0;num1<=numv;num0=num1){
            int numn= num1+num0;
            num1=numn;
            System.out.println(num1);
        }

    }
}
