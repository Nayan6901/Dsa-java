package oop.interfaces;

public class Nicecar{

    private engine engine;
    private media player=new cdplayer();

    public Nicecar(){
        engine=new powerengine();




    }
    public Nicecar(engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

   public void startmusic(){
        player.start();
   }
   public void stopmusic(){
        player.stop();
   }
   public void upgradeengine(){
        this.engine=new ElectricEngine();

   }
}
