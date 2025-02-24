public class flbed {
    public static void main(String[] args) {
        int [ ]nums={1,0,0,0,0,0,1};
        System.out.println( canPlaceFlowers(nums,2));

    }  public  static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int c=0;
        int i=1;
        while(i<flowerbed.length-1){
            if(flowerbed[i-1]!=flowerbed[i] && flowerbed[i+1]==flowerbed[i]) {
                c++;
                i=i+2;
            }
            i++;
        }
        if(c==n){
            return true;
        }
        return false;
    }
}
