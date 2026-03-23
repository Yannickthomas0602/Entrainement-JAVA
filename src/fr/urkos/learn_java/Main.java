package fr.urkos.learn_java;

public class Main {
    public static void main(String[]  args) {
        Player player1 = new Player("Survivant");
        player1.fabrique_baton(5);
        afficher(player1);
//        player1.fabrique_pioche();
        player1.recolte_roche(20);
        afficher(player1);

    }
    private static void afficher(Player player) {
        System.out.println(
                "Nom : " + player.getName() +
                "\n PV : " + player.getHealth() +
                "\n PA : " + player.getAttack() +
                "\n Bois : " + player.getBois() +
                "\n Pierre : " + player.getPierre() +
                "\n Metal : " + player.getMetal() +
                "\n Batons : " + player.getBaton() +
                "\n Pioche : " + player.isPioche() +
                "\n Hache : " +  player.isHache());
    }

}
