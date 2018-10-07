package com.TP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String emotion= null;String nom;
        int hero1=10;int hero2=10;
        Scanner sc= new Scanner(System.in);
        System.out.println("Donner votre nom");
        nom=sc.nextLine();
        while(hero1>5 ||hero1<0) {
            System.out.println("Donnez le numeros de votre 1er hero");
            System.out.println("1-Joie      2-Tristesse     3-Degout        4-Peur      5-Colere");
            hero1 = sc.nextInt() - 1;
        }
        while(hero2>5 ||hero2<0) {
            System.out.println("Donner le numeros de votre 2eme hero");
            System.out.println("1-Joie      2-Tristesse     3-Degout        4-Peur      5-Colere");
            hero2 = sc.nextInt() - 1;
        }
        Joueur joueur = new Joueur(nom,hero1,hero2,emotion);
        joueur.Emotion(joueur);
        System.out.println(joueur.getNom()+" est "+joueur.getEmotion());
    }
}
