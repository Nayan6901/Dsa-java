package oop.inhertance;

public class boxweight extends BOX {


    public boxweight(boxprice other) {
    }

    public boxweight() {

    }

    public static void main(String[] args) {
        BOX box1=new BOX(5.4,3.4,3.2);
        BOX box2=new BOX(box1);
    }


}
