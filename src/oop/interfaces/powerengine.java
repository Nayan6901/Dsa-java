package oop.interfaces;

public class powerengine implements engine {
    @Override
    public void start() {
        System.out.println("power engine is started");
    }

    @Override
    public void stop() {
        System.out.println("power engine is stoped");

    }

    @Override
    public void acc() {
        System.out.println("power engine is acc");

    }
}
