package recursion;

public class fibo {

    public static void main(String[] args) {

        System.out.println(fibo(4));

    }
    public static int fibo(int n){
        //indexing from 0
        if(n<2){
            return n;




        }
        return fibo(n-1)+fibo(n-2);



    }

}
