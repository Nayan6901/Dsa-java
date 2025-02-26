package recursionprac;

public class reverse_numway2 {

    //using helper function
    public static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper( n,digits);

    }
    private static int helper(int n,int digits) {
        int rem=n%10;
        if (n % 10 == n){

            return n;
        }
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);


    }

    public static void main(String[] args) {
       int n= rev2(1234);
        System.out.println(n);

    }
}
