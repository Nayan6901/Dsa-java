package recursion;

public class revrec {
    public static void main(String[] args) {
        System.out.println(reverserec(1234));

    }
    static int reverserec(int n){
        if (n==0){
            return 1;
        }
        return reverserec(n%10)+reverserec(n/10);
    }

}
