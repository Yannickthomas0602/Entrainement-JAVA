package fr.urkos.learn_java;
import java.util.Arrays;
import java.util.Scanner;

public class Recherche_tableau {
    public static void main(String[] args) {
        int[] nombres = {
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11),
                (int) (Math.random()*11)
        };
        System.out.println(Arrays.toString(nombres));
        int compteur_nombre = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 1 et 10 : ");
        int input_user = scanner.nextInt();
        for (int nombre : nombres) {
            if (input_user == nombre) {
                compteur_nombre ++;
            }
        }
        if (compteur_nombre == 0) {
            System.out.println("Le nombre " + input_user + " n'est pas présent dans le tableau.");
        }else {
            System.out.println("Le nombre " + input_user + " est présent " + compteur_nombre + " fois dans le tableau.");
        }
    }
}
