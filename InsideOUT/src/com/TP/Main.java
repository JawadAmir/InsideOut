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
            System.out.println("la 1ere chose qui te vient quand tu vois la couleur ROUGE ");
            System.out.println("1-Amour\n2-Faux.\n3-Chaud\n4-Danger\n5-FEU!");
            hero1 = sc.nextInt() - 1;
        }

        while(hero2>5 ||hero2<0) {
            System.out.println("Tu te reveilles et il pleut, ");
            System.out.println("1-Je suis excité pour sortir sous la pluie\n2-Je suis triste car il pleut\n3-Je déteste la pluie\n4-J'ai de ce qu'il peut passer dans une journée \n5-Je suis énervé car je ne peux pas sortir");
            hero2 = sc.nextInt() - 1;
        }
        Joueur joueur = new Joueur(nom,hero1,hero2,emotion);
        joueur.Emotion(joueur);
        System.out.println(joueur.getNom()+" sent le/la "+joueur.getEmotion());

    }
}

