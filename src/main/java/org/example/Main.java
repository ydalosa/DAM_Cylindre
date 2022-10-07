package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    Cylindre cylindre_rouge = new Cylindre();

    cylindre_rouge.setDiametre(42.5d);
    cylindre_rouge.setHauteur(10.4d);

    cylindre_rouge.setCouleur("rouge");
    System.out.println(cylindre_rouge.getCouleur());

    double volume = cylindre_rouge.getVolume();
    System.out.println("le volume du cylindre est: " + volume);

    cylindre_rouge.setCouleur("vert");
    System.out.println(cylindre_rouge.getCouleur());
}
}