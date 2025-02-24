package arrays;

public class badversion {

    public static void main(String[] args) {
        int arr = 6;
        int hi = firstBadVersion(6,true);
        System.out.println(hi);


    }

    public static int firstBadVersion(int n, boolean isbadver) {

        int start = 1;
        int end = n;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isbadver == false) {
                start = mid + 1;

            } else {
                end = mid;
                return end;
            }
        }
        return mid;
    }
}
