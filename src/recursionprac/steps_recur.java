package recursionprac;

public class steps_recur {
    //basicaly we need to make an counter to count if n is odd then we have to subtract ont
    //else divide by 2;
    public static int steps(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }

        if (n % 2 == 0) {
                return helper(n / 2, count + 1);
            }
            return helper(n - 1, count + 1);

        }

        public static void main (String[]args){
            System.out.println(steps(41));
        }

    }

