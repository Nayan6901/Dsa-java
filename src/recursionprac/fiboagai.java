package recursionprac;

public class fiboagai {
    public static void main(String[] args) {
        System.out.println(fibo(6));

    }public static int fibo(int n){
        if(n<2){
            return n;

        }
        return fibo(n-1)+fibo(n-2);
        //this code not exact optimized solution it only for learning recursion;
    }
}
