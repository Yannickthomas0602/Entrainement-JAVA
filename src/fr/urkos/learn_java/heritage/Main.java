package fr.urkos.learn_java.heritage;

public class Main {
    public static void main(String[]  args) {
        Apple a = new Apple();
        if (!(a instanceof PeelFruit)) {
            PeelFruit fruit = a;
        }

    }
}
