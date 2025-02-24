public class num {
    public static void main(String[] args) {
        int n=7;
        int k=2;
        int count=0;
            int [] factors=new int [n+1];
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    factors[count]=i;
                    count++;
                }

            }

            if(factors[k-1]==0){
                System.out.println(-1);;
            }
        System.out.println(factors[k-1]);

        }
    }


