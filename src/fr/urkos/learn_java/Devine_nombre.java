package fr.urkos.learn_java;

//Génère un nombre secret entre 1 et 100 **
//Demande à l’utilisateur de deviner ce nombre
//Indique si le nombre proposé est trop grand, trop petit ou correct
//Répète la demande tant que l’utilisateur n’a pas trouvé
//Affiche le nombre de tentatives à la fin

//Limiter le nombre de tentatives à 10
//Afficher un message différent si l’utilisateur perd
import java.util.Scanner;
public class Devine_nombre {
    public static void main(String[] args) {
        int nombre_secret = (int) (Math.random()*100) + 1;
        int input_user = 0;
        int compteur = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 1 et 100 : ");
        input_user = scanner.nextInt();
        while (true){
            if (compteur == 9) {
                System.out.println("Dommage !!! Le nombre était : " + nombre_secret);
                break;
            }else {
                if (input_user < nombre_secret) {
                    compteur++;
                    System.out.println("Plus que " + (10 - compteur) + " tentive(s)");
                    System.out.println("Entrer un nombre plus grand : ");
                    input_user = scanner.nextInt();

                } else if (input_user > nombre_secret) {
                    compteur++;
                    System.out.println("Plus que " + (10 - compteur) + " tentive(s)");
                    System.out.println("Entrer un nombre plus petit : ");
                    input_user = scanner.nextInt();
                } else {
                    System.out.println("Bravo !!! Le nombre était : " + nombre_secret);
                    break;
                }
            }


        }

    }
}
