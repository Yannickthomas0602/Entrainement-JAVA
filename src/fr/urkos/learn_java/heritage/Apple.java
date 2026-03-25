package fr.urkos.learn_java.heritage;

public class Apple extends Fruit implements PeelFruit{
    public Apple() {
        super("Pomme");
    }

    @Override
    public void taste() {
        System.out.println("Sucré");
        super.test();
    }

    @Override
    public double getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }


    @Override
    public boolean isPeeled() {
        return false;
    }

    @Override
    public String getSkinType() {
        return "Lisse";
    }
}
