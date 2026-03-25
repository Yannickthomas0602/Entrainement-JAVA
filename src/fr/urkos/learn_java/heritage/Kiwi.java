package fr.urkos.learn_java.heritage;

public class Kiwi extends Fruit implements PeelFruit{

    public Kiwi() {
        super("kiwi");
    }

    @Override
    public void taste() {
        System.out.println("Le kiwi a un gout sucré");
    }

    @Override
    public double getSize() {
        return 1;
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
        return "Poilue";
    }
}
