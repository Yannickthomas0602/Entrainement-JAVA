package fr.urkos.learn_java.heritage;

public class PineApple extends Fruit implements PeelFruit{
    public PineApple() {
        super("Ananas");
    }

    @Override
    public void taste() {
        System.out.println("acide");
    }

    @Override
    public double getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String getSkinType() {
        return "Piquant";
    }
}
