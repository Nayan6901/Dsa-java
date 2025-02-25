package recursionprac;

public class sequenceupdown {
    public static void seq(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        seq(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        seq(5);
    }

}
