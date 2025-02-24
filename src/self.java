import java.util.ArrayList;
import java.util.List;

class self {
    public static void main(String[] args) {
        System.out.println(  selfDividingNumbers(1,22));

    }
        public static List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list=new ArrayList<Integer>();
            while(left<=right){
                String ans=Integer.toString(left);
                if(ans.contains("0")){
                    left++;
                }
                if(isself(left)){
                    list.add(left);
                    left++;
                }else{
                    left++;
                }

            }
            return list;

        }
        public static boolean isself (int n){
            int x=n;
            boolean hi=false;
            while(x>0){
                if (n%(x%10)==0){
                    hi=true;
                    x=x/10;
                }else {
                    return false;
                }


            }
            return hi;
        }
    }

