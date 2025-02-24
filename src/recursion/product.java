package recursion;

public class product {
    public static void main(String[] args) {
        System.out.println(product(5055));

    }
    static int product (int n){
        if (n==0){
            return 1;
        }
       // if(n%10==0){ //for ignore zero
          //  return n/10;
       // }
        return (n%10)*product(n/10);
    }
}
