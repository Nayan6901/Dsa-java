package oop.inhertance;

public class boxprice extends boxweight{
    double cost;
    boxprice(){
        this.cost=-1;
        super();
    }
    boxprice(boxprice other){
        super(other);
        this.cost=other.cost;
    }


}
