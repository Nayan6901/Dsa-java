package pattern;

public class pattern5 {
    public static void main(String[] args) {
        patt(200);

    } public static void patt(int n){
        for (int i = 1; i <=n+n-1; i++) {
            int c=n+n+1;
            for (int j = 1; j <=i; j++) {
                if(j<c-i) {
                    System.out.print("*");

                }
                continue;





            }
            System.out.println();
        }
    }
}
