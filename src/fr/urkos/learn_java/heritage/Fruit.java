package fr.urkos.learn_java.heritage;

public abstract class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public abstract void taste();

    public abstract double getSize();

    public abstract boolean hasSeed();

    public void test() {
        System.out.println("Je fais un test");
    }

    public String getName() {
        return name;
    }
}
