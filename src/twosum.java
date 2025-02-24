public class twosum {
    public static void main(String[] args) {
      int[]arr={-1,0};
        int[]ans=twosum(arr,-1);
        System.out.println(ans);

    }




    public static int[] twosum(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int[] ans ={0,0};
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                for (int i = 0; i < end; i++) {
                    for (int j = 0; j < end; j++) {
                      if (i==j){
                          continue;
                      }
                        else  if (arr[i] + arr[j] == target) {
                            ans[0] = i;
                            ans[1] = j;
                            break;


                        } else if (arr[j] == target) {
                            ans[0] = j;
                            break;
                        }

                    }
                }break;
            }

        }
        return ans;

    }
}
