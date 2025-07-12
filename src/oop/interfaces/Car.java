package oop.interfaces;

public class Car implements Break,engine,media{
    @Override
    public void brake() {
        System.out.println("i brake like normal car");

    }

    @Override
    public void start() {
        System.out.println("i start engine like normak car");

    }

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("i accerlarate like normal car");

    }
}
