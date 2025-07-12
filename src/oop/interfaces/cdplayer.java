package oop.interfaces;

public class cdplayer implements media{
    @Override
    public void start() {
        System.out.println( "rock music is started");
    }

    @Override
    public void stop() {
        System.out.println("rock music is stoped");

    }
}
