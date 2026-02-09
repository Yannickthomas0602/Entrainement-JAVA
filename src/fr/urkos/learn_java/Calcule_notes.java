package fr.urkos.learn_java;

import java.util.Arrays;

public class Calcule_notes {
    public static void main(String[] args) {
        int[] notes = {
                (int) (Math.random()*21),
                (int) (Math.random()*21),
                (int) (Math.random()*21),
                (int) (Math.random()*21)
        };
//        System.out.println(Arrays.toString(notes));

        int max = notes[0];
        int min = notes[0];
        int somme_notes = 0;
        int plus_10 = 0;
        int moins_10 = 0;

        for (int i = 0; i < notes.length;i++) {
            somme_notes += notes[i];
            if (notes[i] > max) {
                max = notes[i];
            }
            if (notes[i] < min) {
                min = notes[i];
            }
            if (notes[i] < 10){
                moins_10++;
            }
            if (notes[i] >= 10){
                plus_10++;
            }
        }
        double moyenne = (double) somme_notes/ notes.length;
        System.out.println(Arrays.toString(notes));
        System.out.println(
                "La moyenne de la classe est de : " + moyenne + "/20 " +
                "\n La note maximale est de : " + max + "/20 " +
                "\n La note minimale est de : " + min + "/20 " +
                "\n Le nombre de notes en dessous de 10 : " +moins_10+
                "\n Le nombre de notes au dessus de 10 : "+ plus_10
        );
    }
}
