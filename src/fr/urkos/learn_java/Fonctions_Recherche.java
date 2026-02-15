package fr.urkos.learn_java;
import java.util.Arrays;
import java.util.Scanner;

public class Fonctions_Recherche {
    public static void main(String[] args){
        int[] tableau = genererTableau(10);
        afficherTableau(tableau);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 0 et 10 : ");
        int input_user = scanner.nextInt();
        if (estPresent(tableau, input_user)) {
            System.out.println("Le nombre " + input_user + " est présent " + compterOccurences(tableau, input_user) + " fois dans le tableau");
        }else {
            System.out.println("Le nombre n'est pas dans le tableau");
        }

    }
    private static int[] genererTableau(int nombre) {
        int[] tableau = new int[nombre];
        for (int i = 0; i < nombre; i++) {
            tableau[i] = (int) (Math.random() * 11);
        }
        return tableau;
    }
    private static void afficherTableau(int[] tableau) {
        System.out.println(Arrays.toString(tableau));
    }
    private static boolean estPresent(int[] tableau, int valeur) {
        boolean est_present = false;
        for (int value : tableau) {
            if (value == valeur) {
                est_present = true;
                break;
            }
        }
        return est_present;
    }
    private static int compterOccurences(int[] tableau, int valeur) {
        int compteur = 0;
        for (int value : tableau) {
            if (value == valeur) {
                compteur++;
            }
        }
        return compteur;
    }
}
