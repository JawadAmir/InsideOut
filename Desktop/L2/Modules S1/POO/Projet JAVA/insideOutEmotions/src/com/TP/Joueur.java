package com.TP;

public class Joueur {
    String nom;
    int Hero1;//chaque int de 0 à 5 est un hero
    int Hero2;
    String emotion;

    public Joueur(String nom, int hero1, int hero2, String emotion) {
        this.nom = nom;
        Hero1 = hero1;
        Hero2 = hero2;
        this.emotion = emotion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHero1() {
        return Hero1;
    }

    public void setHero1(int hero1) {
        Hero1 = hero1;
    }

    public int getHero2() {
        return Hero2;
    }

    public void setHero2(int hero2) {
        Hero2 = hero2;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }


    public void Emotion(Joueur joueur) {
        String emotions = "Extase,Mélancholie,Obsession,Surprise,Férocité,Melancholie,Désespoir,Depression,Anxiété,Trahison" +
                ",Obsession,Dépression," +
                "Mépris,Revulsion,Aversion,Surprise,Anxiété,Révulsion,Terreur,Haine,Férocité,Trahison,Aversion,Haine,Rage";
        String[] emotionsSplit = emotions.split(",");
        String[][] heroes = new String[5][5];
        int y=0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                heroes[i][j] = emotionsSplit[y];
                y++;
            }
        joueur.setEmotion(heroes[joueur.Hero1][joueur.Hero2]);


    }
}