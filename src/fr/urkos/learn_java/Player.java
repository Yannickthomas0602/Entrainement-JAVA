package fr.urkos.learn_java;

import java.util.Arrays;

public class Player {

    private String name;
    private int health = 100;
    private double attack = 1.0;
    private int bois = 0;
    private int pierre = 0;
    private int metal = 0;
    private int baton = 0;
    private boolean pioche = false;
    private boolean hache = false;
    private String[] objets = {};

    public Player(String name) {
        this.name = name;

    }



    // Récoltes --------------------------------------------------------------------------------------------------------

    public void recolte_arbre (int n) {
        for (int i = 0; i < n; i++) {
            if (hache) {
                // System.out.println("Cool j'ai une hache");
                int bois_recolte = (int) (Math.random() * 9) + 1;
                int baton_recolte = (int) (Math.random() * 6);
                bois += bois_recolte;
                baton += baton_recolte;
            } else {
                // System.out.println("Pas de hache");
                int bois_recolte = (int) (Math.random() * 5) + 1;
                int baton_recolte = (int) (Math.random() * 3);
                bois += bois_recolte;
                baton += baton_recolte;
            }
        }


    }

    public void recolte_roche(int n) {
        for (int i = 0; i < n; i++) {
            if (pioche) {
                // System.out.println("Super j'ai ma pioche");
                int pierre_recolte = (int) (Math.random() * 8) + 1;
                int metal_recolte = (int) (Math.random() * 5);
                pierre += pierre_recolte;
                metal += metal_recolte;
            } else {
                // System.out.println("Mince pas de pioche");
                int pierre_recolte = (int) (Math.random() * 4) + 1;
                int metal_recolte = (int) (Math.random() * 3);
                pierre += pierre_recolte;
                metal += metal_recolte;
            }
        }
    }


    // Fabrication -----------------------------------------------------------------------------------------------------

    public void fabrique_baton(int n) {
        for (int i = 0; i < n; i++) {
            while (bois < 1) {
                this.recolte_arbre(1);
                System.out.println("Le survivant récolte du bois");
            }
            baton += 4;
            bois -= 1;
        }
    }
    public void fabrique_pioche() {
        if (baton >= 3 && metal >= 6) {
            baton -= 3;
            metal -= 6;
            pioche = true;
            System.out.println("Pioche craftée");
        }
        else {
            System.out.println("Pas assez de ressource pour faire une pioche. IL te faut 3 batons et 6 de metal.");
        }
    }

    public void fabrique_hache() {
        if (baton >= 3 && metal >= 4) {
            baton -= 3;
            metal -= 4;
            hache = true;
            System.out.println("Hache craftée");
        }
        else {
            System.out.println("Pas assez de ressource pour faire une hache. IL te faut 3 batons et 4 de metal.");
        }
    }








    // Getter and Setter -----------------------------------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public int getBois() {
        return bois;
    }

    public int getPierre() {
        return pierre;
    }

    public int getMetal() {
        return metal;
    }

    public int getBaton() {
        return baton;
    }

    public boolean isPioche() {
        return pioche;
    }

    public boolean isHache() {
        return hache;
    }
}
