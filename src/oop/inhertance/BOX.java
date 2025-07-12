package oop.inhertance;

public class BOX {
    double l;
    double h;
    double w;
    BOX(){
        this.l=-1;
        this.h=-1;
        this.w=-1;


    }
    BOX(Double side){
        this.l=side;
        this.h=side;
        this.w=side;

    }
    BOX(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
BOX(BOX old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;

}


}
