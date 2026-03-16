package fr.urkos.learn_java;

public class Main {
    public static void main(String[]  args) {
        Player player1 = new Player("Aldwin", 100.0, 15.0);

        System.out.println("nom : "+ player1.getName() + ", vie : " + player1.getHealth() + ", attaque : " + player1.getAttack());

        Player player2 = new Player("test",  100.0, 12.0);
        System.out.println("nom : "+ player2.getName() + ", vie : " + player2.getHealth() + ", attaque : " + player2.getAttack());
        System.out.println("nom : "+ player2.getName() + ", vie : " + player2.getHealth() + ", attaque : " + player2.getAttack());
        player2.damage(player1.getAttack());
        System.out.println("nom : "+ player2.getName() + ", vie : " + player2.getHealth() + ", attaque : " + player2.getAttack());

    }

}
