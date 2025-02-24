public class opendors {

    public static void main(String[] args) {
        int x=1;int y=4;
        int z=Math.max(x,y);
        int w=Math.min(x,y);
        int count=0;
        while(z>0){

            if((z&1)!=(w&1)){
                count++;

            }
            z=z>>1;
            w=w>>1;
        }
        System.out.println(count);


    }

}
