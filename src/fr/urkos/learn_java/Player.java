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
    private String[] objets = {};

    public Player(String name) {
        this.name = name;

    }

    public void recolte_arbre () {
        int bois_recolte = (int) (Math.random()*5) + 1 ;
        int baton_recolte = (int) (Math.random()*3);

        bois += bois_recolte;
        baton += baton_recolte;

    }

    public void recolte_roche() {
        int pierre_recolte = (int) (Math.random()+4) +1;
        int metal_recolte = (int) (Math.random()*3);

        pierre += pierre_recolte;
        metal += metal_recolte;
    }

    public void fabrique_baton() {
        baton += 4;
        bois -= 1;
    }

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


}
