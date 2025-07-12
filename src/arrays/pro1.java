package arrays;

public class pro1 {
    public static void main(String[] args){

        int row=5;

        for (int i = 1; i<= row; i++) {
            int n=1;
            for (int j = 1; j<=row; j++) {
                if (j <= row - i) {
                    System.out.print("\t");
                } else {
                    if (n % 2 == 0) {
                        System.out.print("*"+"\t");
                    } else {
                        System.out.print(n + "\t");
                    }
                    n++;
                }

            }  System.out.println();



        }
    }
}
