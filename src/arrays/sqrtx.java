package arrays;

public class sqrtx {
    public static void main(String[] args) {
        int x=5;
        int y =mysqrt(x);
        System.out.println(y);

    }

    public static int mysqrt(int x) {
        if (x == 0) {
            return 0;
        } else {
            int start = 0;
            int end = x;
            int mid=0;
            while (start < end) {
                 mid = start + (end - start) / 2;
                if (x / mid < mid) {
                    end = mid - 1;
                } else if (x / mid > mid) {
                    start = mid + 1;

                } else {
                    return mid;
                }
            }
            return mid;

        }
    }
}
