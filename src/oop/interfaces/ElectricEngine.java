package oop.interfaces;

public class ElectricEngine implements engine{
    @Override
    public void start() {
        System.out.println("electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("electric engine is stoped ");
    }

    @Override
    public void acc() {
        System.out.println("electric engine is acc");

    }
}
