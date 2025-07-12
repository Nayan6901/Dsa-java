package oop.genrics;

public class customarraylist {
    private int []data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customarraylist(){
        this.data=new int [DEFAULT_SIZE];
    }
    public void add(int num){
        if(isfull()){
            resize();

        }
        data[size++]=num;
    }

    private void resize() {
        int []temp=new int [data.length*2];
        //copy the array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
     return data.length==size;
    }


}
