package fr.urkos.learn_java.heritage;

public class Strawberry extends Fruit {
    public Strawberry() {
        super("Fraise");
    }

    @Override
    public void taste() {
        System.out.println("La fraise a un gout sucré");
    }

    @Override
    public double getSize() {
        return 0.5;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
