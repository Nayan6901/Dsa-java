package arrays;

public class gussnum {
    public static void main(String[] args) {
        int n =40;



    }
    public static int guessnumber (int n){
        int start=1;
        int end =n;
        int mid=0;
        while(start<=end){
             mid =start+(end-start)/2;
            int guess= guessnumber(n);
            if (guess==0){
                return mid;

            } else if (guess==1) {
                start=mid+1;



            }else{
                end=mid-1;
            }
        }return mid;
    }
}
