package recursionprac;

public class countzero_rec {




   public static  int count(int n){
       return helper(n,0);
   }
//
// or static int count =0;

    private static int helper (int n,int count){
      if(n==0){
          return count;
      }
        if(n%10==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);
        }

    }

    public static void main(String[] args) {
        System.out.println(count(10));

}
}
