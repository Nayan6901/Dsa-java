public class happynum {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(ans2(1111111));
    }
    public static boolean ans2(int n){
        while(n>7){
        if(ans(n)==1){
            return(true);
        }else{
            n=ans(n);
            ans(n);
        }


        }
        return(false);

    }
    public static int ans(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}


