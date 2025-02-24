package nayan;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class addsub {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your First number: ");
        int num1= input.nextInt();
        System.out.print("Enter your Second number:");
        int num2=input.nextInt();
        System.out.print("Enter your oprant:");
        char oprant =input.next().charAt(0);

        if(oprant== '+'){
            int add = num1+num2;
            System.out.println("Your addition is="+add);

        } else if ('-' == oprant) {
            int sub= num1-num2;
            System.out.println("Your Subtraction is="+sub);


        } else if (oprant=='*') {
            int mult = num1*num2;
            System.out.println("Your multiplication is="+mult);

        } else if (oprant=='/') {
            int div = num1*num2;
            System.out.println("Your division is="+div);

        }
        else{
            System.out.println("please enter valid oprant like(+,-,*,/,)");
        }


    }
}
