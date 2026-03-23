package fr.urkos.learn_java;

public class Main {
    public static void main(String[]  args) {
        Player player1 = new Player("GG");
        afficher(player1);
    }
    private static void afficher(Player player) {
        System.out.println(player.getName());
    }

}
